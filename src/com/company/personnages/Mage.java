package com.company.personnages;

public class Mage {

    private String name;
    private int vieMin;
    private int vieMax;
    private int niveauDeVie;
    private int forceMin;
    private int forcemax;
    private int forceAttaque;
    private String defence;
    private String sort;

    //------------------------------------------------------------------------
    public Mage() {
        name = " lucifer ";
        niveauDeVie = 6;
        vieMin = 3;
        vieMax = 6;
        forceAttaque = 15;
        forceMin = 8;
        forcemax = 15;
        defence = "philtre";
        sort = "avada-quedavra";
    }

    public Mage(String name) {
        this.name = name;
        niveauDeVie = 6;
        forceAttaque = 15;
    }

    public Mage(int niveauDeVie, int forceAttaque) {
        name = " lucifer ";
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;

    }

    public Mage(String name, int niveauDeVie, int forceAttaque) {
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    //------------------------------------------------------------------------
    @Override
    public String toString() {
        return "nom: " + name + "niveau de vie: " + niveauDeVie + " force:  " + forceAttaque;
    }

    //-----------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public String getDefence() {
        return defence;
    }

    public String getSort() {
        return sort;
    }
    //-----------------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
};

