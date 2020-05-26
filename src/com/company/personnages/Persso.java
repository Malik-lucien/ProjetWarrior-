package com.company.personnages;

import java.util.Random;

//apstract (empèche de d'instencier) pour limiter des risques !!!!!!!!!!!
public abstract class Persso {
    //------------attribus/////-
    protected String name;
    protected int niveauDeVie;
    protected int forceAttaque;
    protected int vieMin;
    protected int vieMax;
    protected int forceMin;
    protected int forcemax;

    //-------constructeur /--------------
    public Persso() {
        this.name = "patrice";
        this.niveauDeVie = 7;
        this.forceAttaque = 8;
    }

    public Persso(int niveauDeVie, int forceAttaque) {
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;

    }

    public Persso(String name, int niveauDeVie, int forceAttaque) {
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

    public Persso(String name, int niveauDeVie, int forceAttaque, int vieMin, int vieMax, int forceMin, int forcemax) {
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
        this.vieMin = vieMin;
        this.vieMax = vieMax;
        this.forceMin = forceMin;
        this.forcemax = forcemax;
    }

    //-------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public int getVieMin() {
        return vieMin;
    }

    public int getVieMax() {
        return vieMax;
    }

    public int getForceMin() {
        return forceMin;
    }

    public int getForcemax() {
        return forcemax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }


    public void setVieMin(int vieMin) {
        this.vieMin = vieMin;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public void setForceMin(int forceMin) {
        this.forceMin = forceMin;
    }

    public void setForcemax(int forcemax) {
        this.forcemax = forcemax;
    }

    @Override
    public String toString() {
        return "Persso{" +
                "name='" + name + '\'' +
                ", niveauDeVie=" + niveauDeVie +
                ", forceAttaque=" + forceAttaque +
                ", vieMin=" + vieMin +
                ", vieMax=" + vieMax +
                ", forceMin=" + forceMin +
                ", forcemax=" + forcemax +
                '}';
    }
}


