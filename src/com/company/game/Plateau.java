package com.company.game;

import com.company.armes.BouleDeFeu;
import com.company.armes.Eclaire;
import com.company.armes.Epees;
import com.company.armes.Massue;
import com.company.bonus.GrandPotion;
import com.company.bonus.PotionStandard;
import com.company.personnages.*;

import java.util.ArrayList;
import java.util.Collections;


public class Plateau {

    private int casePlateaux;
    private int caseDepart;
    private int positionJoueur;
    private int dice1;
    private int resultDice;
    private int retourCaseDepart;
    private int nombreDeTour;
    private int casefin;
    private ArrayList<Case> cases;


    //-----------------------------constructeur -----------------------------------------------------------

    public Plateau() {
        casePlateaux = 64;
        casefin = 64;
        caseDepart = 1;
        positionJoueur = caseDepart;
        nombreDeTour = 0;
        dice1 = (int) (Math.random() * (6) + 1);
        resultDice = dice1;
        retourCaseDepart = caseDepart;
        cases = new ArrayList<>();

        for (int i = 0; i < this.casePlateaux + 1; i++) {

            switch (i) {
                case 45, 52, 56, 62:
                    cases.add(new Dragons());
                    break;
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47:
                    cases.add(new Sorcier());
                    break;
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    cases.add(new Goblins());
                    break;
                case 2, 11, 5, 22, 38:
                    cases.add(new Massue());
                    break;
                case 19, 26, 42, 53:
                    cases.add(new Epees());
                    break;
                case 1, 4, 8, 17, 23:
                    cases.add(new Eclaire());
                    break;
                case 48, 49:
                    cases.add(new BouleDeFeu());
                    break;
                case 7, 13, 31, 33, 39, 43:
                    cases.add(new PotionStandard());
                    break;
                case 28, 41:
                    cases.add(new GrandPotion());
                    break;
                default:
                    cases.add(new CaseVide());
                    break;
            }
            Collections.shuffle(cases);
        }
    }

    public Plateau(int casePlateaux, int caseDepart, int positionJoueur, int resultDice, int nombreDeTour) {
        this.casePlateaux = casePlateaux;
        this.caseDepart = caseDepart;
        this.positionJoueur = positionJoueur;
        this.resultDice = resultDice;
        this.nombreDeTour = nombreDeTour;
        this.dice1 = resultDice;
    }

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

    public void setCases(ArrayList cases) {
        this.cases = cases;
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

    public ArrayList getCases() {
        return this.cases;
    }

//----------------------------------methode-------------------------------------------------


    public void rulesGame(Persso personnage) throws PersonnageHorsPlateauException {
        positionJoueur = caseDepart;
        while (positionJoueur < casefin) {
            resultDice = (int) (Math.random() * (6) + 1);
            nombreDeTour++;
            System.out.println(" lancer n° " + nombreDeTour);
            positionJoueur += resultDice;
            if (positionJoueur == casefin) {
                System.out.println(" Fin de partie felicitation vous, n'êtes pas mort ");
            } else if (positionJoueur > casefin) {
                throw new PersonnageHorsPlateauException();
//                positionJoueur -= resultDice * 2;
            }
            if (cases.get(positionJoueur) instanceof Ennemie) {
                Ennemie ennemie = (Ennemie) cases.get(positionJoueur);
                ennemie.interaction(personnage);

            }
            System.out.println(" vous avez avancer de " + resultDice + " vous etes sur la case " + positionJoueur + cases.get(positionJoueur).toString());
        }
    }

    @Override
    public String toString() {
        return " vous etes sur la case : " + positionJoueur + " dice: " + resultDice + " nombre de lancer " + nombreDeTour;
    }
}
//  try {
//          plateau.rulesGame(personnage);
//          } catch (PersonnageHorsPlateauException e) {
//          newspos = plateau.getPositionJoueur() - plateau.getResultDice() * 2;
//          plateau.setPositionJoueur(newspos);
////                e.printStackTrace();
//          System.out.println(e.getMessage());
//          }


//private void removeCase(int index){
//  cases.set(index, new CaseVide());
//}/* creer une methode priver permettant d'jouter une case passer en parametre a un index donnée
//    creer unemethode priver qui retoune une case a l'index donner en parametre
//*/
