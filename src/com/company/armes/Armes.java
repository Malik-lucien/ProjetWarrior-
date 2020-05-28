package com.company.armes;

import game.Case;

public abstract class Armes extends Case {
    //attribut --------------------------------------------------------------------------
    protected String name;
    protected int force;


    //----------constructeur ------------------------------------------------------------
    public Armes() {
        name =" Epee ";
        force = 5;
    }
    public Armes(String name, int force){
        this.name = " Epee ";
        this.force = 5;
    }
    //---------getter /setter ------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}