package com.company.personnages;

public class Sorcier extends Ennemie {
    public Sorcier() {
        super("sorcier", 2, 9);
        this.setName("Sorcier");
        this.setNiveauforce(2);
        this.setNiveauvie(9);
    }

    public String toString() {
        return name + " force = " + niveauforce + " vie = " + niveauvie;
    }
}
