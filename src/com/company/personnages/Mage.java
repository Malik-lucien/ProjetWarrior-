package com.company.personnages;

public class Mage extends Persso {

    private String defence;
    private String sort;

    //------------------------------------------------------------------------
    public Mage() {
        super(" lucifer ", 6, 15,3,6,8,15);
        this.defence = " philtre ";
        this.sort = " avada-quedavra ";

    }

    public Mage(String name) {
        this(name,6,15);
    }

    public Mage(int niveauDeVie, int forceAttaque) {
        this(" malik ",niveauDeVie, forceAttaque);
    }

    public Mage(String name, int niveauDeVie, int forceAttaque) {
        super(name, niveauDeVie, forceAttaque,3,6,8,15);
        this.defence =" philtre ";
        this.sort =" avada-quedavra ";
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
}

