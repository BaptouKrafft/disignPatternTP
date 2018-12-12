package visiteur;

public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;

    public Photo(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }



    @Override
    void accept(final Visiteur v) {
        v.visit(this);
    }

    @Override
    String getType() {
        return "Photo";
    }

    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

    public String getNom(){
        return this.nom;
    }


    public String getNomFichier() {
        return nomFichier;
    }

    public String getAuteur() {
        return auteur;
    }
}
