package com.company.game;

import com.company.armes.BouleDeFeu;
import com.company.armes.Eclaire;
import com.company.armes.Epees;
import com.company.armes.Massue;
import com.company.bonus.GrandPotion;
import com.company.bonus.PotionStandard;
import com.company.personnages.Dragons;
import com.company.personnages.Goblins;
import com.company.personnages.Sorcier;

import java.util.ArrayList;
import java.util.Collections;

public class Plateau {
    //--------------------------initialisation des variables--------------------------------
    /**
     * DANS UNE PREMIER TEMPS JE VAIS INITIALISER DES VARIABLES PRIVATE (ACCECIBLE UNIQUEMENT DANS CE FICHIER)
     * AVEC LES ATTRIBUT DONS J'AI BESOIN
     */
    private int casePlateaux;
    private int caseDepart;
    private int positionJoueur;
    private int dice1;
    private int resultDice;
    private int retourCaseDepart;
    private int nombreDeTour;
    private int casefin;
    private ArrayList<Case> cases;



    /**
     * ARRAYLIST : TABLEAU
     */
    //-----------------------------constructeur -----------------------------------------------------------

    /**
     * JE CONSTRUIT UN CONSTRUCTEUR SANS PARAMETRE
     * QUI AURA DES VALEUR PAR DEFAUT COMME SI DESOUS
     */
    public Plateau() {
        casePlateaux = 64;
        casefin = 64;
        caseDepart = 1;
        positionJoueur = caseDepart;
        nombreDeTour = 0;
        dice1 = (int) (Math.random() * (7));
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

            //--------------------------------------------------------------------


           //-------------------------------------------------------------------------
        }
//        System.out.println(plateau.size());
//        Case caseTeste = plateau.get(48);
//        for (int c = 0; c < plateau.size(); c++) {
//            System.out.println(" vous etes sur la case " + c + plateau.get(c));
//        }


    }

    /**
     * JE CRER UN AUTRE CONSTRUCTEUR AVEC PLUSIEUR PARAMETRES
     *
     * @param casePlateaux
     * @param caseDepart
     * @param positionJoueur
     * @param resultDice
     * @param nombreDeTour   JE FAIT APPEL A C'EST  PARAM EN UTILISANT LE MOTS CLEF THIS.
     *                       EXEMPLE :   this.caseDepart = caseDepart;
     *                       LA CASE DEPART PRENDRAT POUR VALEUR CA QUE L'UTILISATEUR ENTRERA QUAND IL APPELERA LA METHODE PLATEAU
     */

    public Plateau(int casePlateaux, int caseDepart, int positionJoueur, int resultDice, int nombreDeTour) {
        this.casePlateaux = casePlateaux;
        this.caseDepart = caseDepart;
        this.positionJoueur = positionJoueur;
        this.resultDice = resultDice;
        this.nombreDeTour = nombreDeTour;
        this.dice1 = resultDice;
    }

    /**
     * LE SETTER SERV A MODIFIER DES VALEUR QµDANS LE FICHIER .
     * NOUS LUTILISON DE LA NAGNERE SUIVANTE : setCasePlateaux(UN ENTIER)
     * CELA MODIFIRA LA VALEUR DE CASE PLATEAU
     */

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

    /**
     * LE GETTER LUI SE CHARGE JUSTE DE R'ENVOYER LA VALEUR QUI LUI EST DONNER
     * retourne moi la valeur de casePlateaux(), il ne prend auccune valeur en parametre
     */

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

    /**
     * une metode est un enssemble de règle ecrite par le developpeur
     *
     * @throws PersonnageHorsPlateauException dans mon cas je cree une methode public qui se nome ruleGame(), elle est suivi de trows ... {} ce qui veut dire qui dans cette parcelle de code il peut y avoir un risque
     */

    public void rulesGame() throws PersonnageHorsPlateauException {

        positionJoueur = caseDepart;
        /**
         * tant que pos jouer et < casePlat ou pose J > casePlat alors je continue de faire />
         */
        while (positionJoueur < casefin || positionJoueur > casefin) {
            resultDice = (int) (Math.random() * (7));
            /**
             * la position du joueur avance
             */
            nombreDeTour++;
            System.out.println(" lancer n° " + nombreDeTour);
            /**
             * lancer un dé compris en 0 et 6
             */
            positionJoueur += resultDice;
            /**
             * le nombre de toure augmente de 1 a chaque tour de boucle
             */
            if (positionJoueur == casefin) {
                /**
                 * si  pjoueur = casePlateaux alors affiche vous avez gagner
                 */
                System.out.println(" Fin de partie felicitation vous, n'êtes pas mort ");

            } else if (positionJoueur > casefin) {
                /**
                 * sinon si pjouer > casePlateau alors créer une nouvelle ecxeption
                 */
                positionJoueur -= resultDice * 2;
                if (positionJoueur > casefin) {
                    throw new PersonnageHorsPlateauException();
                }
            }
            System.out.println(" vous avez avancer de " + resultDice + " vous etes sur la case " + positionJoueur + cases.get(positionJoueur));

        }
    }

    @Override
    /**
     * string tostring permet de retranscrire les attributs en string
     */
    public String toString() {
        return " vous etes sur la case : " + positionJoueur + " dice: " + resultDice + " nombre de lancer " + nombreDeTour;
    }
}