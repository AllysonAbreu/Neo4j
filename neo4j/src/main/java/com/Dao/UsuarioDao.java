package com.Dao;

import com.model.Pessoa;
import org.neo4j.driver.*;

import static org.neo4j.driver.Values.parameters;

public class UsuarioDao {

    public UsuarioDao(){}

    public Driver driverAccess(){
        Driver driver = GraphDatabase.driver("bolt://localhost:7687",
                AuthTokens.basic("neo4j","123"));
        return driver;
    }
    
    public void cadastro(Pessoa user){

        Driver driver = driverAccess();

        try(Session session = driver.session()){
            session.run("CREATE (p:Pessoa{nome:$nome, email:$email})",
                    parameters("nome", user.getNome(), "email", user.getEmail()));
        }finally {
            driver.close();
        }
    }

    public void seguir(Pessoa user, Pessoa user2){

        Driver driver = driverAccess();

        try(Session session = driver.session()){
            session.run("MATCH(p1:Pessoa{email:$email}),(p2:Pessoa{email:$email2})" +
                    "CREATE (p1) - [:AMIGO] -> (p2)",
                    parameters("email", user.getEmail(),"email2", user2.getEmail()));
        }finally {
            driver.close();
        }
    }

    public void verUsers(){

        Driver driver = driverAccess();

        try(Session session = driver.session()){
            Result result = session.run("MATCH(p:Pessoa) RETURN p.nome");
            result.list().forEach(r -> System.out.println(r.values()));
        }finally {
            driver.close();
        }
    }

    public void verSeguidores(Pessoa user){

        Driver driver = driverAccess();

        try(Session session = driver.session()){
            Result result = session.run("MATCH (p:Pessoa{email:$email}) - [:AMIGO] ->(Pessoa)" +
                    "RETURN Pessoa.nome", parameters("email", user.getEmail()));
            result.list().forEach(r -> System.out.println(r.values()));
        } finally {
            driver.close();
        }
    }


    public void recomendarSeguidores(Pessoa user, Pessoa user2){

        Driver driver = driverAccess();

        try(Session session = driver.session()){
            Result result = session.run("MATCH (p:Pessoa{email:$email}) - [:AMIGO] ->(p2:Pessoa{email:$email2})" +
                    "-[:AMIGO]->(Pessoa) WHERE NOT (p)-[:AMIGO]-> (Pessoa) AND p <> Pessoa " +
                    "RETURN Pessoa.nome", parameters("email", user.getEmail(), "email2", user2.getEmail()));
            System.out.println("Lista com as recomendações:");
            result.list().forEach(r -> System.out.println(r.values()));
        } finally {
            driver.close();
        }
    }

}
