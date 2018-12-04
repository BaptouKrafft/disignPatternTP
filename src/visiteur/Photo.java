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
    int accept(Visiteur v) {
        return 1;
    }

    @Override
    String getNomPourArticle(Visiteur v,String askedAuthor) {
        return "";
    }




    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }
}
