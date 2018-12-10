package visiteur;

public class Article extends Media {
    protected String auteur;
    protected String nomFichier;
    public Article(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }




    @Override
    void accept(Visiteur v) {
        v.visit(this);
    }

    @Override
    String getType() {
        return "Article";
    }

    public String getAuteur() {
        return auteur;
    }
    public String getNom(){return this.nom;}

    @Override
    public String toString() {
        return "Article{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }
}
