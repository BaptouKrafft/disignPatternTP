package visiteur;

public class VisitAuteur implements Visiteur {

    String listeArticles;
    String askedAuteur;
    public VisitAuteur(String askedAuteur) {
       this.listeArticles="";
       this.askedAuteur=askedAuteur;
    }

    @Override
    public int visitElement(Album a) {
        return 0;
    }

    @Override
    public int visitElement(Photo p) {
        return 0;
    }

    @Override
    public String visitElementAuthor(Album a) {

        for (Media m: a){
            this.listeArticles=this.listeArticles+m.getNomPourArticle(this,askedAuteur);
        }
        return this.listeArticles;
    }

    @Override
    public String visitElementAuthor(Article a) {

       return null;
    }

    public String getListeArticles(){
        return this.listeArticles;
    }


}
