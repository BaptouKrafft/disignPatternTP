package visiteur;

public class Video extends Media {
    protected String auteur;
    protected String nomFichier;
    public Video(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    public int accept(Visiteur v){
        return 0;
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
