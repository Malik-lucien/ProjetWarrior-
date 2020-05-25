package com.company.armes;

public class Eclaire extends Sort{
    public Eclaire (){
        super("Eclaire",2);
        this.setName("éclaire");
        this.setForce(2);
    }
    public String toTtring(){return " name "+ name+ " force ajouter : " + force;}
}
