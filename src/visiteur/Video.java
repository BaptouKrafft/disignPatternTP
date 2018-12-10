package visiteur;

public class Video extends Media {
    protected String auteur;
    protected String nomFichier;
    protected String format;
    public Video(int d, String nom, String auteur, String nomFichier,String format) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
        this.format=format;

    }

    @Override
    String getType() {
        return "Video";
    }

    public String getFormat(){
        return this.format;
    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public String toString() {
        return "Video{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    void accept(final Visiteur v) {
        v.visit(this);
    }



}
