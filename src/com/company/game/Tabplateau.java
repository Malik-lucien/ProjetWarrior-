package com.company.game;

import java.util.ArrayList;

public class Tabplateau {
    //--------- attribut --------------------------
    private ArrayList plateau;
    private int caseMax;
    private int posJ;
    private int dice;
    private int lancer;
    private Object Ennemie;
    private Object Bonus;
    private Object Tabplateau;

    //----------constructeur --------------------------

    public Tabplateau() {
        caseMax = 4;
        posJ = 1;
        dice = 1;
        lancer = 0;
    }
    //-----getter / setter

    //------------------------
    public void tabSimp() {
        posJ = posJ + dice;
        lancer++;
        ArrayList<Object> plateau = new ArrayList<>();
        plateau.add("");
        plateau.add(Ennemie);
        plateau.add("");
        plateau.add(Bonus);
        for (int i = 0; i < plateau.size(); i++) {
            System.out.println("vous êtes sur la case : " + i  + plateau.get(i));
        }
        while (posJ > caseMax) {
            if (posJ < caseMax) {
                posJ += dice;
                lancer++;
            } else if (posJ == caseMax) {
                System.out.println("vous avez finie");
            } else {
                System.out.println("continuer a jouer ");
            }
        }

    }


    public String toString() {
        return "position joueur est : " + posJ;
    }
}

