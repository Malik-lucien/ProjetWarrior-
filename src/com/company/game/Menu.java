package com.company.game;

import com.company.personnages.Guerrier;
import com.company.personnages.Mage;
import com.company.personnages.Persso;


import java.util.Scanner;

public class Menu {
    //-------------------initialisation des données --------------------------------------------------------------------
    private String newgame;
    private int newspos;

    //-------------------constructeurs ---------------------------------------------------------------------------------
    public Menu() {
        newgame = "Bienvenue!!!";
    }


    //------------------getters-----------------------------------------------------------------------------------------
    public String getNewgame() {
        return newgame;
    }

    //-----------------setters------------------------------------------------------------------------------------------

    public void setNewgame(String newgame) {
        this.newgame = newgame;
    }
    //---------------methode--------------------------------------------------------------------------------------------

    public void messageAcceuil() {
        System.out.println(newgame);
    }

    /**
     * utiliser scanner (pour lire les resultat pour renvoyer au main le resultat du scanner avec un return
     */
    public Persso choicePlayer() {

        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        while (!created) {
            System.out.println("quel personnage voulez vous jouez ? " +
                    " - mage " + " ou  " +
                    " - guerrier ");
            String choise = scanner.nextLine();
            if (choise.equals("guerrier")) {
                Guerrier guerrier = new Guerrier();
                created = true;
                System.out.println(" vous avez choisi: " + guerrier.toString());
                return guerrier;

            } else if (choise.equals("mage")) {
                Mage mage = new Mage();
                created = true;
                System.out.println(" vous avez choisi: " + mage.toString());
                return mage;
            } else if (choise.equals("licorne")) {
                System.out.println("ne te prend pas pour une licore petit scarabé ");

            } else {
                System.out.println("erreur saisir donner valide");
            }
        }
/** la methode scanner sert a lire les informations entrées par l'utilisateur  et en suite pouvoir interagire avec!, .nextLine serv a taper les informations dans la console,
 *  avec .equals() je peux verifier si l'utilisateur a rentrer la bonne donner*/
//        System.out.println(" choisisez votre hero ");
//        String choice = scanner.nextLine();
//        System.out.println(" vous avez choisie: " + choice + " ? confirmer avec y pour 'yes', ou n pour  'no'");
        String verif = scanner.nextLine();
        if (verif.equals("y")) {
            System.out.println(" let is go ?");
        } else {
            System.out.println("retour a l'acceuil ");
            messageAcceuil();
            choicePlayer();
        }
        return null;
    }

    public void lancerPartie(Persso personnage) {
        Scanner scanner = new Scanner(System.in);
        Plateau plateau = new Plateau();
        String start = scanner.nextLine();

        if (start.equals("y")) {
            System.out.println(" go  !!!!!!!!!!!!!! ");
            try {
                plateau.rulesGame(personnage);
            } catch (PersonnageHorsPlateauException e) {
                newspos = plateau.getPositionJoueur() - plateau.getResultDice() * 2;
                plateau.setPositionJoueur(newspos);
                newspos += plateau.getResultDice();
            }
        } else {
            System.out.println(" retour a l'acceil !");
            messageAcceuil();
            choicePlayer();
        }
        System.out.println(" fin de partie voulez-vous recommencer une partie  ? ");
        String verif1 = scanner.nextLine();
        System.out.println(verif1);
        System.out.println(" restart ? ");
        if (verif1.equals("y")) {
            try {
                plateau.rulesGame(personnage);
                if (plateau.getPositionJoueur() < 64){
                    newspos = plateau.getPositionJoueur() - plateau.getResultDice() * 2;
                }
            } catch (PersonnageHorsPlateauException e) {

                plateau.setPositionJoueur(newspos);
                newspos += plateau.getPositionJoueur();
            }
        } else {
            System.out.println(" exit ");
        }
    }
}