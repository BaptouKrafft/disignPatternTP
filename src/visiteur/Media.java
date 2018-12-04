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

    abstract int accept(Visiteur v);

    abstract String getNomPourArticle(Visiteur v,String askedAuthor);
}
