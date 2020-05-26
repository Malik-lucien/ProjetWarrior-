package com.company.personnages;

public class Goblins extends Ennemie{
    public Goblins(){
        super("Goblins",1,6,0,6,1,1);

    }
    public String toString() {
        return name + " force = " + niveauforce + " vie = " + niveauvie;
    }

}
