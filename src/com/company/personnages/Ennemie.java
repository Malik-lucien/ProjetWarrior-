package com.company.personnages;

import game.Case;

public abstract class Ennemie extends Case {
    protected String name;
    protected int niveauvie;
    protected int niveauforce;
    protected int vieMin;
    protected int vieMax;
    protected int forceMin;
    protected int forcemax;

    public Ennemie() {
        this.name = " ENNEMIE ";
        this.niveauforce = 1;
        this.niveauvie = 1;

    }

    public Ennemie(int niveauforce, int niveauvie) {
        this.niveauforce = niveauforce;
        this.niveauvie = niveauvie;
    }

    public Ennemie(String name, int niveauforce, int niveauvie) {
        this.name = name;
        this.niveauforce = niveauforce;
        this.niveauvie = niveauvie;
    }

    public Ennemie(String name, int niveauforce, int niveauvie, int vieMin, int vieMax, int forceMin, int forcemax) {
        this.name = name;
        this.niveauforce = niveauforce;
        this.niveauvie = niveauvie;
        this.vieMin = vieMin;
        this.vieMax = vieMax;
        this.forceMin = forceMin;
        this.forcemax = forcemax;

    }

    //------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveauvie() {
        return niveauvie;
    }

    public void setNiveauvie(int niveauvie) {
        this.niveauvie = niveauvie;
    }

    public int getNiveauforce() {
        return niveauforce;
    }

    public void setNiveauforce(int niveauforce) {
        this.niveauforce = niveauforce;
    }

    public int getVieMin() {
        return vieMin;
    }

    public void setVieMin(int vieMin) {
        this.vieMin = vieMin;
    }

    public int getVieMax() {
        return vieMax;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public int getForceMin() {
        return forceMin;
    }

    public void setForceMin(int forceMin) {
        this.forceMin = forceMin;
    }

    public int getForcemax() {
        return forcemax;
    }

    public void setForcemax(int forcemax) {
        this.forcemax = forcemax;
    }


}
