package visiteur;

import java.util.Calendar;
import java.util.Date;

public abstract class Media {
    protected int annee ;
    protected String nom ;

    protected Media(int a, String nom) {
        this.annee = a;
        this.nom = nom;
    }

    abstract void accept(Visiteur v);

    abstract String getType();

}
