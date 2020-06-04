package com.company.personnages;

import com.company.armes.Massue;
import com.company.game.Case;
import com.company.game.Menu;
import com.company.game.Plateau;

public abstract class Ennemie implements Case {
    protected String name;
    protected int niveauvie;
    protected int niveauforce;
    protected int vieMin;
    protected int vieMax;
    protected int forceMin;
    protected int forcemax;

    public Ennemie() {
        this.name = " ENNEMIE ";
        this.niveauforce = 1;
        this.niveauvie = 1;

    }

    public Ennemie(int niveauforce, int niveauvie) {
        this.niveauforce = niveauforce;
        this.niveauvie = niveauvie;
    }

    public Ennemie(String name, int niveauforce, int niveauvie) {
        this.name = name;
        this.niveauforce = niveauforce;
        this.niveauvie = niveauvie;
    }

    public Ennemie(String name, int niveauforce, int niveauvie, int vieMin, int vieMax, int forceMin, int forcemax) {
        this.name = name;
        this.niveauforce = niveauforce;
        this.niveauvie = niveauvie;
        this.vieMin = vieMin;
        this.vieMax = vieMax;
        this.forceMin = forceMin;
        this.forcemax = forcemax;

    }

    //------------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveauvie() {
        return niveauvie;
    }

    public void setNiveauvie(int niveauvie) {
        this.niveauvie = niveauvie;
    }

    public int getNiveauforce() {
        return niveauforce;
    }

    public void setNiveauforce(int niveauforce) {
        this.niveauforce = niveauforce;
    }

    public int getVieMin() {
        return vieMin;
    }

    public void setVieMin(int vieMin) {
        this.vieMin = vieMin;
    }

    public int getVieMax() {
        return vieMax;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public int getForceMin() {
        return forceMin;
    }

    public void setForceMin(int forceMin) {
        this.forceMin = forceMin;
    }

    public int getForcemax() {
        return forcemax;
    }

    public void setForcemax(int forcemax) {
        this.forcemax = forcemax;
    }

    @Override
    public void interaction(Persso personnage) {
        while (this.niveauvie > 0 && personnage.getNiveauDeVie() > 0) {
            if (this.niveauforce > personnage.getForceAttaque()) {
                personnage.niveauDeVie -= this.niveauforce;
                System.out.println(" vous avez :" + personnage.niveauDeVie);
                if (this.niveauvie == 0) {
                    System.out.println(" l'ennelie es mort ");

                } else if (personnage.getNiveauDeVie() <= 0) {
                    System.out.println(" vous êtes mort ");
                    System.exit(0);

                }
            } else if (personnage.forceAttaque > this.niveauvie) {
                this.niveauvie -= personnage.forceAttaque;
                System.out.println(" l'ennemie a  :" + niveauvie);
                if (this.niveauvie == 0) {
                    System.out.println(" l'ennelie es mort ");

                } else if (personnage.getNiveauDeVie() <= 0) {
                    System.out.println(" vous êtes mort ");
                    System.exit(0);
                }
            }
        }
        System.out.println(" ennemie ici ");
    }
}


