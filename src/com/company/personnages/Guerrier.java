package com.company.personnages;

import java.util.Random;

public class Guerrier {
    // POUR CHAQUE ATTRIBUT FAIRE UN GETTER ET UN SETTER,  IMPOSSIBLE D4ACCEDER DIRECTEMENT AU ATTRIBUT DE C'
    protected String name;
    protected int niveauDeVie;
    protected int forceAttaque;
    protected String bouclier;
    protected String arme;
    private int vieMin;
    private int vieMax;
    private int forceMin;
    private int forcemax;

    //----------------------------------------------------------------------------------------------------------------------
    public Guerrier() {
        vieMin = 5;
        vieMax = 10;
        forceMin = 5;
        forcemax = 10;

        name = "jean-heude";
        niveauDeVie = 6;
        forceAttaque = 10;
        bouclier = "";
        arme = "albarde";
    }

    public Guerrier(String name) {
        this.name = name;
        niveauDeVie = 10;
        forceAttaque = 8;
    }

    public Guerrier(int forceAttaque, int niveauDeVie) {
        name = "tanjyro ";
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    public Guerrier(String name, int niveauDeVie, int forceAttaque) {
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    @Override
    public String toString() {
        return name + " niveau de vie: " + niveauDeVie + " force:  " + forceAttaque;
    }

    //---------------------------------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public String getBouclier() {
        return bouclier;
    }

    public String getArme() {
        return arme;
    }
    //-------------------------------------------------------------------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

}
