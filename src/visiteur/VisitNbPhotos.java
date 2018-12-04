package visiteur;

public class VisitNbPhotos implements Visiteur{
    private int S;
    VisitNbPhotos(){
        this.S=0;
    }

   public int visitElement(Photo p){
        return p.accept(this);
   }


   public int visitElement(Album a){
       for (Media med : a )
           this.S=this.S+med.accept(this);
       return this.S;
   }

   public int getS(){
       return S;
   }
}
