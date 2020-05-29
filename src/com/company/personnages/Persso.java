package com.company.personnages;

import com.company.game.Case;

import java.util.Random;

//apstract (empèche de d'instencier) pour limiter des risques !!!!!!!!!!!

/**
 * creation de ma class Persso() avec un type public et une methode abstract
 */
public abstract class Persso extends Case   {
    //------------attribus/////-
    /**
     * initialisation de tous mes attribus de type int (entier) et String (texte)
     */
    protected String name;
    protected int niveauDeVie;
    protected int forceAttaque;
    protected int vieMin;
    protected int vieMax;
    protected int forceMin;
    protected int forcemax;


    //-------constructeur /--------------

    /**
     * initialisation du constructeur persso() qui ne prend aucun paramettre
     */
    public Persso() {
        this.name = "patrice";
        this.niveauDeVie = 7;
        this.forceAttaque = 8;
    }

    /**
     * initialisation du constructeur persso(avec 2 param)
     *
     * @param niveauDeVie  = niveau de vie que va avoir le hero incarner par le jouer
     * @param forceAttaque = niveau de force que va avoir le hero incarner par le jouer
     */
    public Persso(int niveauDeVie, int forceAttaque) {
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;

    }

    /**
     * initialisation du constructeur persso(avec 3 param)
     *
     * @param name         le nom que va porter le hero incarner par le joueur
     * @param niveauDeVie  niveau de vie que va avoir le hero incarner par le jouer
     * @param forceAttaque niveau de force que va avoir le hero incarner par le jouer
     */
    public Persso(String name, int niveauDeVie, int forceAttaque) {
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
    }

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

  @Override
   /**
     *  public String toString() renvoie une chaine de caractères représentant l'objet renseigné.
     */
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


