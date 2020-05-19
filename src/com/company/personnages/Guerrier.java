package com.company.personnages;

import java.util.Random;

public class Guerrier extends Persso {
    // POUR CHAQUE ATTRIBUT FAIRE UN GETTER ET UN SETTER,  IMPOSSIBLE D4ACCEDER DIRECTEMENT AU ATTRIBUT DE C'


    //----------------------------------------------------------------------------------------------------------------------
    public Guerrier() {
        super("malik",5,10);
        this.vieMin = 5;
        this.vieMax = 10;
        this.forceMin = 5;
        this.forcemax = 10;
        bouclier = "";
        arme = "albarde";
    }

    public Guerrier(String name) {
        this("malik",5,10);
    }

    public Guerrier(int forceAttaque, int niveauDeVie) {
        this("",niveauDeVie, forceAttaque);
    }

    public Guerrier(String name, int niveauDeVie, int forceAttaque) {
        super(name, niveauDeVie, forceAttaque);
    }

    @Override
    public String toString() {
        return name + " niveau de vie: " + niveauDeVie + " force:  " + forceAttaque;
    }

    //---------------------------------------------------------------------------------------------------------------------
    public String getBouclier() {
        return bouclier;
    }

    public String getArme() {
        return arme;
    }
    //-------------------------------------------------------------------------------------------------------------------------

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

}
