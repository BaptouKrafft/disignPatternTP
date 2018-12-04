package interpreteur;

public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    public Photo(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    int getNombreDePhoto(){
        return 1;
    }

    int getNombreDeVideo(){
        return 0;
    }

    int getNombreArticle() { return 0; }


    @Override
    String getAuteur() {
        return null;
    }

    @Override
    String getNom() {
        return null;
    }

    @Override
    String getType() {
        return null;
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
