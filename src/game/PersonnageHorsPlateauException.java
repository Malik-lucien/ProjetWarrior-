package game;

public class PersonnageHorsPlateauException extends Exception {
    public PersonnageHorsPlateauException(){
        super("");
        System.out.println(" vous ne pouvez pas dépasser le nombre total de case ");
    }
}
