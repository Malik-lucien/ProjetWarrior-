package com.company.armes;

import game.Case;

public abstract class Sort extends Case {
    protected String name;
    protected int force;

    public Sort() {
        name = "les arcanes lunaire ";
        force = 10000;

    }
   public Sort(String name,int force){
        this.name= "éclaire";
        this.force=2;
   }

//---------------------------------------------------------------------------------------------

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
