package com.company;
import com.company.Plateau;
import com.company.personnages.Mage;
import com.company.personnages.Guerrier;
import com.company.personnages.Persso;


public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.messageAcceuil();
        menu.choicePlayer();
        //---------------------------------------------------------------------------------
        Plateau plateau = new Plateau();
        plateau.rulesGame();
        System.out.println(plateau);
        //--------------------------------------------------------------------------------
        Persso Npersso =new Persso();

        //---------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------


    }
}
