package interpreteur;

import java.util.Calendar;
import java.util.Date;

public abstract class Media {
    protected int annee ;
    protected String nom ;

    protected Media(int a, String nom) {
        this.annee = a;
        this.nom = nom;
    }
    abstract int getNombreDePhoto();
    abstract int getNombreDeVideo();
    abstract int getNombreArticle();
    abstract String getAuteur();
    abstract String getNom();
    abstract String getType();
}
