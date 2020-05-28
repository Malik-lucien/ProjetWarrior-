package com.company.armes;

public class Epees extends Armes {
    public Epees() {
        super("Epee", 5);

    }

    public String toString() {
        return " name " + name + " force ajouter : " + force;
    }
}
