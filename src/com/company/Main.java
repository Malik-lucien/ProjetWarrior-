package com.company;

import com.company.game.Case;
import com.company.game.Menu;
import com.company.game.Plateau;
import com.company.personnages.Dragons;
import com.company.personnages.Persso;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {


        //---------------------------------------------------------------------------------
        Menu menu = new Menu();
        menu.messageAcceuil();
        Persso personnage = menu.choicePlayer();
        menu.lancerPartie(personnage);

        //--------------------------------------------------------------------------------------


    }
}
//        Tabplateau newPlateau = new Tabplateau();
//        System.out.println(newPlateau);
//        newPlateau.tabSimp();
//        Plateau plateau = new Plateau();
//        System.out.println(plateau);
//        Guerrier guerrier = new Guerrier();
//        System.out.println(guerrier.somme());

