package visiteur;

public class VisitNbPhotos implements Visiteur{

    private int Somme;
    VisitNbPhotos(){
        this.Somme=0;
    }


    public void visit(Photo p) {
        this.Somme=this.Somme+1;
    }

    public int getSomme(){
        return this.Somme;
    }

    public void visit(Album album) {
    }


    public void visit(Video v) {
    }

    public void visit(Article a){

    }

}
