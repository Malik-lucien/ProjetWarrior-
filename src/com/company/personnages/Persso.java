package com.company.personnages;

import com.company.game.Case;
import com.company.game.Plateau;

import java.util.Random;

//apstract (empèche de d'instencier) pour limiter des risques !!!!!!!!!!!

/**
 * represantation des personnage de mon jeu
 * @author Malik
 * @version V0.1
 */
public abstract class Persso implements Case {
    //------------attribus/////-
    /**
     * declaration de tous mes attribus avec une porter reduite (protected)
     */
    protected String name;
    protected int niveauDeVie;
    public static int forceAttaque;
    protected int vieMin;
    protected int vieMax;
    protected int forceMin;
    protected int forcemax;


    //-------constructeur /--------------
    /**
     * initialisation de mon constructeur avec 7 param
     *
     * @param name         le nom que va porter le hero incarner par le joueur
     * @param niveauDeVie  niveau de vie que va avoir le hero incarner par le jouer
     * @param forceAttaque niveau de force que va avoir le hero incarner par le jouer
     * @param vieMin       la vie min du hero
     * @param vieMax       la vie max du hero
     * @param forceMin     la forece min du hero
     * @param forcemax     la force max du hero
     */
    public Persso(String name, int niveauDeVie, int forceAttaque, int vieMin, int vieMax, int forceMin, int forcemax) {
        /**
         * this.name = mane; ===> le nom = au nom qui sera instancier au moment de l'appel du constructeur.
         * idem pour tous les autres
         */
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
        this.vieMin = vieMin;
        this.vieMax = vieMax;
        this.forceMin = forceMin;
        this.forcemax = forcemax;
    }

    //-------------------------------------------------------

    /**
     * creation d'un getter (serv a afficher)
     *
     * @return name ===> le nom que l'utilidateur va entrer l'utilisateur
     */
    public String getName() {
        return name;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public int getVieMin() {
        return vieMin;
    }

    public int getVieMax() {
        return vieMax;
    }

    public int getForceMin() {
        return forceMin;
    }

    public int getForcemax() {
        return forcemax;
    }

    /**
     * je crer un setter (sert a modifier une valeur)
     *
     * @param name de type String qui servira a modifier le nom
     *             avec setName("qsdbfsld") je nom prendra pour valeur qsdbfsld
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }


    public void setVieMin(int vieMin) {
        this.vieMin = vieMin;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public void setForceMin(int forceMin) {
        this.forceMin = forceMin;
    }

    public void setForcemax(int forcemax) {
        this.forcemax = forcemax;
    }

    /**
     *
     * @param potion correspond a un ajout de point de vie (+2 point de vie)
     *
     */
    public void potion(int potion) {
        int vie_Maximum = niveauDeVie + potion;
        if (vie_Maximum < this.vieMax) {
            this.niveauDeVie = vie_Maximum;
        } else {
            this.niveauDeVie = this.vieMax;
        }
    }

    /**
     *
     * @param Grande_potion correspond a  l'ajout de point de vie a mon personnage (+5 point de vie)
     */

    public void grande_potion(int Grande_potion) {
        int vie_Maximum = niveauDeVie + Grande_potion;
        if (vie_Maximum < this.vieMax) {
            this.niveauDeVie = vie_Maximum;
        } else {
            this.niveauDeVie = this.vieMax;
        }
    }
    /**
     * public String toString() renvoie une chaine de caractères représentant l'objet renseigné.
     */
    @Override
    public String toString() {
        return "Persso{" +
                "name='" + name + '\'' +
                ", niveauDeVie=" + niveauDeVie +
                ", forceAttaque=" + forceAttaque +
                ", vieMin=" + vieMin +
                ", vieMax=" + vieMax +
                ", forceMin=" + forceMin +
                ", forcemax=" + forcemax +
                '}';
    }
}


