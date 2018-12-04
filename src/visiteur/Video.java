package visiteur;

public class Video extends Media {
    protected String auteur;
    protected String nomFichier;
    public Video(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    @Override
    int accept(Visiteur v) {
        return 0;
    }

    @Override
    String getNomPourArticle(Visiteur v,String askedAuthor) {
        return "";
    }

    @Override
    public String toString() {
        return "Video{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }
}
