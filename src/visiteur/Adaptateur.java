package visiteur;


public class Adaptateur extends Media {

    protected SupportDeComm support;



    public Adaptateur(int d, String nom,Photo photo,String texte){
        super(d,nom);
        this.support=new SupportDeComm(photo.getNom(),photo.getNomFichier(),photo.annee,texte);
    }

    @Override
    void accept(Visiteur v) {

    }


    String getNom() {
        return this.nom;
    }


    @Override
    String getType() {
        return null;
    }
}
