package com.company.bonus;

public class GrandPotion extends Bonus {
    public GrandPotion() {
        super("Gande potion de vie ", 5);
    }

    public String toString() {
        return " name = " + name + " vie ajouter = " + grandePotionDeVie;
    }
}
