package com.company.personnages;

public class Mage extends Persso {

    private String defence;
    private String sort;

    //------------------------------------------------------------------------
    public Mage() {
        super("lucier", 6, 15);
        this.vieMin = 3;
        this.vieMax = 6;
        this.forceMin = 8;
        this.forcemax = 15;
        this.defence = "philtre";
        this.sort = "avada-quedavra";
    }

    public Mage(String name) {
        this(name,6,15);
    }

    public Mage(int niveauDeVie, int forceAttaque) {
        this("",niveauDeVie, forceAttaque);
    }

    public Mage(String name, int niveauDeVie, int forceAttaque) {
        super(name, niveauDeVie, forceAttaque);
    }

    //----------------------override--------------------------------------------------
    @Override
    public String toString() {
        return "nom: " + name + "niveau de vie: " + niveauDeVie + " force:  " + forceAttaque;
    }

    //----------------getter-------------------------------------------------------

    public String getDefence() {
        return defence;
    }
    public String getSort() {
        return sort;
    }
    //-----------------setter------------------------------------------------------

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
};

