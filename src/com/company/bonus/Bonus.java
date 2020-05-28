package com.company.bonus;

import com.company.game.Case;

public abstract class Bonus extends Case {
    protected String name;
    protected int potionDeVie;
    protected int grandePotionDeVie;

    Bonus(){
        this.name =" potion de vie ";
        this.potionDeVie = 2;
        this.grandePotionDeVie = 5;
    }
    Bonus(String name, int potionDeVie){
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
}
