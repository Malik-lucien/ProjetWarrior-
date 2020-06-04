package com.company.bonus;

import com.company.game.Case;
import com.company.game.Plateau;
import com.company.personnages.Persso;

public abstract class Bonus implements Case {
    protected String name;
    protected int potionDeVie;
    protected int grandePotionDeVie;

    Bonus() {
        this.name = " potion de vie ";
        this.potionDeVie = 2;
        this.grandePotionDeVie = 5;
    }

    Bonus(String name, int potionDeVie) {
        this.name = " potion de vie ";
        this.potionDeVie = 2;
    }

    public int getPotionDeVie() {
        return potionDeVie;
    }

    public void setPotionDeVie(int potionDeVie) {
        this.potionDeVie = potionDeVie;
    }

    public int getGrandePotionDeVie() {
        return grandePotionDeVie;
    }

    public void setGrandePotionDeVie(int grandePotionDeVie) {
        this.grandePotionDeVie = grandePotionDeVie;
    }

    public void interaction(Persso personnage) {
        personnage.potion(this.potionDeVie);
        personnage.grande_potion(this.grandePotionDeVie);
    }
}