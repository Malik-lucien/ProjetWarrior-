package com.company.game;

import com.company.personnages.Persso;

public class CaseVide implements Case {
    protected String caseVide;


    public CaseVide() {
        caseVide = " vous etes sur une case vide tu est trkl ici tkt ";
    }
    public void interaction(Persso personnage) {
        System.out.println(caseVide);
    }


    @Override
    public String toString() {
        return caseVide;
    }
}



