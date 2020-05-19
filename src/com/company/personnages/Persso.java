package com.company.personnages;

import java.util.Random;
//apstract pour limiter des risques !!!!!!!!!!!
public class Persso {
    //------------attribus/////-
    protected String name;
    protected int niveauDeVie;
    protected int forceAttaque;
    protected String bouclier;
    protected String arme;
    protected int vieMin;
    protected int vieMax;
    protected int forceMin;
    protected int forcemax;

    //-------constructeur /--------------
    public Persso() {
        this.name = "patice";
        this.niveauDeVie = 7;
        this.forceAttaque = 8;
    }
    public Persso(String name, int niveauDeVie, int forceAttaque){
        this.name = "patice";
        this.niveauDeVie = 7;
        this.forceAttaque = 8;
    }
    public Persso(int niveauDeVie, int forceAttaque){
        this.niveauDeVie = 6;
        this.forceAttaque=8;

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

    public String getBouclier() {
        return bouclier;
    }

    public String getArme() {
        return arme;
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

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }

    public void setArme(String arme) {
        this.arme = arme;
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
                ", bouclier='" + bouclier + '\'' +
                ", arme='" + arme + '\'' +
                ", vieMin=" + vieMin +
                ", vieMax=" + vieMax +
                ", forceMin=" + forceMin +
                ", forcemax=" + forcemax +
                '}';
    }
}


