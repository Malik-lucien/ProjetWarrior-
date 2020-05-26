package com.company.personnages;

public class Guerrier extends Persso {
    // POUR CHAQUE ATTRIBUT FAIRE UN GETTER ET UN SETTER,  IMPOSSIBLE D4ACCEDER DIRECTEMENT AU ATTRIBUT DE C'
    protected String bouclier;
    protected String arme;

    //----------------------------constructeur----------------------------------------
    public Guerrier() {
        super("malik", 5, 10, 0, 10, 1, 10);
        this.bouclier = "";
        this.arme = "albarde";

    }

    public Guerrier(String name) {
        this("malik", 5, 10);
    }

    public Guerrier(int forceAttaque, int niveauDeVie) {
        this("toto", niveauDeVie, forceAttaque);
    }

    public Guerrier(String name, int niveauDeVie, int forceAttaque) {
        super(name, niveauDeVie, forceAttaque);
    }

    //-----------------------override------------------------------------------------------------------------
    @Override
    public String toString() {
        return name + " niveau de vie: " + niveauDeVie + " force:  " + forceAttaque;
    }

    //-------------------------getter--------------------------------------------------------------------------------------------

    public String getBouclier() {
        return bouclier;
    }

    public String getArme() {
        return arme;
    }
    //------------------------setter-------------------------------------------------------------------------------------------------

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }
}
