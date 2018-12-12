package interpreteur;

public class Adaptateur extends Media {

    SupportDeComm support;

    public Adaptateur(int a,String nom,Photo photo,String texte){
        super(a,nom);
        this.support=new SupportDeComm(photo.getNom(),photo.getNomFichier(),photo.annee,texte);
    }

    @Override
    int getNombreDePhoto() {
        return 0;
    }

    @Override
    int getNombreDeVideo() {
        return 0;
    }

    public SupportDeComm getSupport() {
        return support;
    }

    @Override
    int getNombreArticle() {
        return 0;
    }

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
}
