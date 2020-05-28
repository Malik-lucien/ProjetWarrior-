package com.company.bonus;

public class PotionStandard extends Bonus{
    public PotionStandard(){
        super("potion de vie",2);
    } public String toString(){
        return " name = " + name + " vie ajouter = " + potionDeVie;
    }
}
