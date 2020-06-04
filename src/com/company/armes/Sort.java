package com.company.armes;

import com.company.game.Case;
import com.company.personnages.Persso;

public abstract class Sort implements Case {
    protected String name;
    protected int force;

    public Sort() {
        name = "les arcanes lunaire ";
        force = 10000;

    }

    public Sort(String name, int force) {
        this.name = "éclaire";
        this.force = 2;
    }

    public void interaction(Persso mage) {
        mage.forceAttaque += this.force;
        System.out.println(" il ya un sort  : " + mage.forceAttaque);
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
