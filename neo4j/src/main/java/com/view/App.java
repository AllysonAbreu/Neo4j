package com.view;

import com.model.Pessoa;
import com.Dao.UsuarioDao;

import java.util.ArrayList;


public class App {

    public static void main(String[] args) {

        ArrayList <Pessoa> users = new ArrayList();

        Pessoa user = new Pessoa("Allyson Abreu", "allyson.cz@hotmail.com");
        users.add(user);
        Pessoa user2 = new Pessoa("Igor Abreu", "igor.cz@hotmail.com");
        users.add(user2);
        Pessoa user3 = new Pessoa("Patrick Anderson", "patrick.cz@hotmail.com");
        users.add(user3);
        Pessoa user4 = new Pessoa("Pedro Manuel", "manuel.cz@hotmail.com");
        users.add(user4);
        Pessoa user5 = new Pessoa("João Gezuino", "joao.cz@hotmail.com");
        users.add(user5);
        Pessoa user6 = new Pessoa("Ticio Melo", "ticio.cz@hotmail.com");
        users.add(user6);
        Pessoa user7 = new Pessoa("Mevio Silva", "mevio.cz@hotmail.com");
        users.add(user7);
        Pessoa user8 = new Pessoa("Caio Pereira", "caio.cz@hotmail.com");
        users.add(user8);
        Pessoa user9 = new Pessoa("Yasmin Silva", "yasmin.cz@hotmail.com");
        users.add(user9);
        Pessoa user10 = new Pessoa("Yohana Lira", "yohana.cz@hotmail.com");
        users.add(user10);
        Pessoa user11 = new Pessoa("Pamela Moreira", "pamela.cz@hotmail.com");
        users.add(user11);
        Pessoa user12 = new Pessoa("Caroline Oliveira", "caroline.cz@hotmail.com");
        users.add(user12);
        Pessoa user13 = new Pessoa("Micaela Feitosa", "micaela.cz@hotmail.com");
        users.add(user13);
        Pessoa user14 = new Pessoa("Laura Pacheco", "laura.cz@hotmail.com");
        users.add(user14);
        Pessoa user15 = new Pessoa("Ana Beatriz", "ana.cz@hotmail.com");
        users.add(user15);


        UsuarioDao usr = new UsuarioDao();

//        //cadastro da galera
//        for (Pessoa usuario : users) {
//            usr.cadastro(usuario);
//        }
////
//        //primeira rodada de seguimores.
//        usr.seguir(user, user15);
//        usr.seguir(user2, user14);
//        usr.seguir(user3, user13);
//        usr.seguir(user4, user12);
//        usr.seguir(user5, user11);
//        usr.seguir(user6, user10);
//        usr.seguir(user7, user9);
//        usr.seguir(user8, user2);
//        usr.seguir(user15, user);
//        usr.seguir(user14, user2);
//        usr.seguir(user13, user3);
//        usr.seguir(user12, user4);
//        usr.seguir(user11, user5);
//        usr.seguir(user10, user6);
//        usr.seguir(user9, user7);
//        usr.seguir(user2, user8);
////
//        //segunda rodada de seguimores.
//        usr.seguir(user, user2);
//        usr.seguir(user3, user4);
//        usr.seguir(user5, user6);
//        usr.seguir(user7, user8);
//        usr.seguir(user9, user10);
//        usr.seguir(user11, user12);
//        usr.seguir(user13, user14);
//        usr.seguir(user4, user3);
//        usr.seguir(user6, user5);
//        usr.seguir(user10, user9);
//        usr.seguir(user14, user13);
////
//        //terceira rodada de seguimores.
//        usr.seguir(user3, user14);
//        usr.seguir(user14, user3);
//        usr.seguir(user6, user15);
//        usr.seguir(user15, user6);
//        usr.seguir(user2, user);
//        usr.seguir(user10, user8);
//        usr.seguir(user8, user10);
//        usr.seguir(user11, user9);
//        usr.seguir(user7, user);
//        usr.seguir(user, user7);
//        usr.seguir(user3, user6);
//        usr.seguir(user6, user3);
//        usr.seguir(user5, user8);
//        usr.seguir(user10, user15);


//        usr.verUsers();


//        usr.verSeguidores(user15);
//        usr.recomendarSeguidores(user, user15);



    }
}
