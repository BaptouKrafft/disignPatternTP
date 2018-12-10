package visiteur;

public class VisitAuteur implements Visiteur {

    String listeArticles;
    String askedAuteur;
    public VisitAuteur(String askedAuteur) {
       this.listeArticles="";
       this.askedAuteur=askedAuteur;
    }

    @Override
    public void visit(Album a) {

    }

    @Override
    public void visit(Photo photo) {

    }

    @Override
    public void visit(Article article) {
        if (article.getAuteur()==askedAuteur){
            this.listeArticles=this.listeArticles+" "+article.getNom();
        }
    }

    @Override
    public void visit(Video video) {

    }



    public String getListeArticles(){
        return this.listeArticles;
    }


}
