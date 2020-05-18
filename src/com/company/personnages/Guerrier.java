package com.company.personnages;

import java.util.Random;

public class Guerrier extends Persso {
    // POUR CHAQUE ATTRIBUT FAIRE UN GETTER ET UN SETTER,  IMPOSSIBLE D4ACCEDER DIRECTEMENT AU ATTRIBUT DE C'


    //----------------------------------------------------------------------------------------------------------------------
    public Guerrier() {
        this.getvieMin() = 5;
        this.VieMax() = 10;
        forceMin = 5;
        forcemax = 10;

        this.setName("patrice");
        niveauDeVie = 6;
        forceAttaque = 10;
        bouclier = "";
        arme = "albarde";
    }

    public Guerrier(String name) {
        this.getName();
        this.setNiveauDeVie(10);
        this.setForceAttaque(8);
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
