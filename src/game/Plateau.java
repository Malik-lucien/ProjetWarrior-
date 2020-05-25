package game;

import java.util.ArrayList;

public class Plateau {
    //--------------------------initialisation des variables--------------------------------
    private int casePlateaux;
    private int caseDepart;
    private int positionJoueur;
    private int dice1;
    private int resultDice;
    private int retourCaseDepart;
    private int nombreDeTour;
    private ArrayList plateau;

    //-----------------------------constructeur -----------------------------------------------------------
    public Plateau() {
        casePlateaux = 64;
        caseDepart = 1;
        positionJoueur = caseDepart;
        nombreDeTour = 0;
        resultDice = dice1;
        retourCaseDepart = caseDepart;
    }


    public Plateau(int casePlateaux, int caseDepart, int positionJoueur, int resultDice, int nombreDeTour) {
        this.casePlateaux = casePlateaux;
        this.caseDepart = caseDepart;
        this.positionJoueur = positionJoueur;
        this.resultDice = resultDice;
        this.nombreDeTour = nombreDeTour;
        this.dice1 = resultDice;
    }
    //-------------------------@override----------------------------------------


    //----------------------------- setter --------------------------------------

    public void setCasePlateaux(int casePlateaux) {
        this.casePlateaux = casePlateaux;
    }

    public void setCaseDepart(int caseDepart) {
        this.caseDepart = caseDepart;
    }

    public void setPositionJoueur(int positionJoueur) {
        this.positionJoueur = positionJoueur;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public void setResultDice(int resultDice) {
        this.resultDice = resultDice;
    }

    public void setRetourCaseDepart(int retourCaseDepart) {
        this.retourCaseDepart = retourCaseDepart;
    }

    //-------------------------------- getter --------------------------------------
    public int getCasePlateaux() {
        return this.casePlateaux;
    }

    public int getCaseDepart() {
        return this.caseDepart;
    }

    public int getPositionJoueur() {
        return this.positionJoueur;
    }

    public int getDice1() {
        return this.dice1;
    }

    public int getResultDice() {
        return this.resultDice;
    }

    public int getRetourCaseDepart() {
        return this.retourCaseDepart;
    }

//----------------------------------methode-------------------------------------------------

    public void rulesGame() throws PersonnageHorsPlateauException {

        positionJoueur = caseDepart;
        while (positionJoueur < casePlateaux || positionJoueur > casePlateaux) {
            resultDice = (int) (Math.random() * (7));
            positionJoueur += resultDice;
            nombreDeTour++;
            if (positionJoueur == casePlateaux) {
                System.out.println("Fin de partie felicitation vous, n'êtes pas mort");

            } else if (positionJoueur > casePlateaux) {
                throw new PersonnageHorsPlateauException();
            }
        }
    }

    @Override
    public String toString() {
        return " la position du joueur est: " + positionJoueur + " dice: " + resultDice + " nombre de lancer " + nombreDeTour;
    }
}