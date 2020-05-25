package com.company.personnages;

public class Goblins extends Ennemie{
    public Goblins(){
        super("Goblins",1,6);
        this.setName("Goblins");
        this.setNiveauforce(1);
        this.setNiveauvie(6);
    }
    public String toString() {
        return name + " force = " + niveauforce + " vie = " + niveauvie;
    }

}
