package com.company;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Guerrier guerrier = new Guerrier();
        System.out.println("nom: "+guerrier.name + " niveau de force: "+ guerrier.forceAttaque +" " + guerrier.image+" HP " +guerrier.niveauDeVie +" arme: "+guerrier.arme + " bouclier "+ guerrier.bouclier);
        MageDesArcane mageDesArcane = new MageDesArcane();
        System.out.println("nom "+mageDesArcane.name+ " niveau de force: "+mageDesArcane.forceAttaque+ "  "+ mageDesArcane.image+" HP "+ mageDesArcane.niveauDeVie+ " arme "+mageDesArcane.sort+ " defence "+ mageDesArcane.defence);
        Menu menu = new Menu();
        System.out.println(" "+ menu.newgame);
    }
}
