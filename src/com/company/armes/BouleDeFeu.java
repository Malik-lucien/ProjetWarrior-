package com.company.armes;

public class BouleDeFeu extends Sort {
    public BouleDeFeu() {
        super("BouleDeFeu", 7);
        this.setName("Boule de feu");
        this.setForce(7);
    }

    public String toString() {
        return " name " + name + " force ajouter : " + force;
    }
}
