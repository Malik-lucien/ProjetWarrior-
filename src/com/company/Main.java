package com.company;

import com.company.personnages.Guerrier;
import game.Menu;
import game.Plateau;
import game.Tabplateau;


public class Main {


    public static void main(String[] args) {
//        Tabplateau newPlateau = new Tabplateau();
//        System.out.println(newPlateau);
//        newPlateau.tabSimp();
//        Plateau plateau = new Plateau();
//        System.out.println(plateau);
        Menu menu = new Menu();
        menu.messageAcceuil();
        menu.choicePlayer();
        menu.lancerPartie();


        //---------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------


    }
}
