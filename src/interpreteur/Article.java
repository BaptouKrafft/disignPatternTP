package interpreteur;

public class Article extends Media {
    private String auteur;
    private String nomFichier;
    public  Article(int d, String nom, String auteur, String nomFichier) {
        super(d,nom);
        this.auteur=auteur;
        this.nomFichier=nomFichier;
    }
    int getNombreDePhoto(){
        return 0;

    }
    int getNombreDeVideo(){
        return 0;
    }

    int getNombreArticle(){
        return 1;
    }

    @Override
    String getType() {
        return null;
    }

    @Override
    String getNom() {
        return this.nom;
    }

    String getAuteur(){
        return this.auteur;
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
