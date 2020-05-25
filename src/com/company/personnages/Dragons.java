package com.company.personnages;

public class Dragons extends Ennemie {
    public Dragons() {
        super("dragon", 4, 15);
        this.setName("Dragon");
        this.setNiveauforce(4);
        this.setNiveauvie(15);
    }

    public String toString() {
        return name + " force = " + niveauforce + " vie = " + niveauvie;
    }
}
