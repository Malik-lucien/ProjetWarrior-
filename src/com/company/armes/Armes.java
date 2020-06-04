package com.company.armes;

import com.company.game.Case;
import com.company.game.Plateau;
import com.company.personnages.Persso;
import org.w3c.dom.ls.LSOutput;

public abstract class Armes implements Case {
    //attribut --------------------------------------------------------------------------
    protected String name;
    protected int force;


    //----------constructeur ------------------------------------------------------------
    public Armes() {
        name = " Epee ";
        force = 5;
    }

    public Armes(String name, int force) {
        this.name = " Epee ";
        this.force = 5;
    }

    public void interaction(Persso guerrier) {
        guerrier.forceAttaque += this.force;
        System.out.println(" il y a une arme ici " + guerrier.forceAttaque);

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