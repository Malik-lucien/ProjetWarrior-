package com.company.personnages;

public class Sorcier extends Ennemie {
    public Sorcier() {
        super(" sorcier ", 2, 9,0,9,1,2);
    }
    public String toString() {
        return name + " force = " + niveauforce + " vie = " + niveauvie;
    }
}
