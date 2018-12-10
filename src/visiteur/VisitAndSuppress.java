package visiteur;

public class VisitAndSuppress implements Visiteur {

    String author;

    public VisitAndSuppress(String author){
        this.author=author;
    }

    @Override
    public void visit(Album a) {

       for (Media m:a){
           if (m.getType()=="Video"){
               a.supprimer(m);
           }
       }
    }

    @Override
    public void visit(Photo photo) {

    }

    @Override
    public void visit(Article article) {

    }

    @Override
    public void visit(Video video) {

    }







}
