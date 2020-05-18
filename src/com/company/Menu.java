package com.company;

import com.company.personnages.Guerrier;
import com.company.personnages.Mage;
import org.w3c.dom.ls.LSOutput;


import java.util.Scanner;

public class Menu {
    //-------------------initialisation des données --------------------------------------------------------------------
    private String newgame;


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
    public void choicePlayer() {


        boolean created = false;
        Scanner scanner = new Scanner(System.in);
        while (!created) {
            System.out.println("quel personnage voulez vous jouez ? " +
                    " - mage " +
                    " - guerrier ");
            String choise = scanner.nextLine();
            if (choise.equals("guerrier")) {
                Guerrier guerrier = new Guerrier("malik", 6, 5);
                created = true;
                System.out.println(" vous avez choisi: " + guerrier.toString());
            } else if (choise.equals("mage")) {
                Mage mage = new Mage("malik ", 4, 15);
                created = true;
                System.out.println(" vous avez choisi: " + mage.toString());
            } else {
                System.out.println("erreur saisir donner valide");
            }
        }
/** la methode scanner sert a lire les informations entrées par l'utilisateur  et en suite pouvoir interagire avec!, .nextLine serv a taper les informations dans la console,
 *  avec .equals() je peux verifier si l'utilisateur a rentrer la bonne donner*/

        System.out.println(" choisisez votre hero ");
        String choice = scanner.nextLine();


        System.out.println(" vous avez choisie: " + choice + " ? confirmer avec y pour 'yes', ou n pour  'no'");
        String verif = scanner.nextLine();


        if (verif.equals("y")) {
            System.out.println(" let is go ?");

        } else {
            System.out.println("retour a l'acceuil ");
            messageAcceuil();
            choicePlayer();
        }
        Plateau plateau = new Plateau();
        String start = scanner.nextLine();
        if (start.equals("y")) {
            System.out.println(" go  !!!!!!!!!!!!!! ");
            plateau.rulesGame();

        } else {
            System.out.println(" retour a l'acceil !");
            messageAcceuil();
            choicePlayer();
        }

        System.out.println(" fin de partie voulez-vous recommencer une partie  ? ");
        String verif1 = scanner.nextLine();
        System.out.println(verif1);
        if (verif1.equals("y")) {
            System.out.println(" restart ? ");
            if (verif1.equals("r")) ;
            {
                plateau.rulesGame();
            }
            if (verif1.equals("y")) {
                System.out.println(" restart ? ");
                plateau.rulesGame();
            } else {
                System.out.println(" exit ");
            }


        }


        //------------------------------------------------------------------------------------------------------------------


    }
}