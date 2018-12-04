package visiteur;

public class Article extends Media {
    protected String auteur;
    protected String nomFichier;
    public Article(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    public int accept(Visiteur v){
        return 0;
    }



    @Override
    public String toString() {
        return "Article{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }
}
