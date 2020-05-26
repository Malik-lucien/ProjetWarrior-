package com.company.personnages;

public class Dragons extends Ennemie {
    public Dragons() {
        super("dragon", 4, 15,0,15,1,4);
    }
    public String toString() {
        return name + " force = " + niveauforce + " vie = " + niveauvie;
    }
}
