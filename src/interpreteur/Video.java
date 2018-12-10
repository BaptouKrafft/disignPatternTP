package interpreteur;

public class Video extends Media {

    private String auteur;
    private String nomFichier;
    private  String type;
    public  Video(int d, String nom, String auteur, String nomFichier,String type) {
        super(d,nom);
        this.auteur=auteur;
        this.nomFichier=nomFichier;
        this.type=type;
    }
    int getNombreDePhoto(){
        return 0;

    }
    int getNombreDeVideo(){
        return 1;
    }

    int getNombreArticle(){
        return 0;
    }

    String getType(){

        return type;
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
        return "Video{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

}
