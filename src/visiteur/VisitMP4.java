package visiteur;

public class VisitMP4 implements Visiteur {

    String listeMP4;

    public VisitMP4(){
        this.listeMP4="";
    }

    @Override
    public void visit(Album a) {

    }

    @Override
    public void visit(Photo photo) {

    }

    @Override
    public void visit(Article article) {

    }

    @Override
    public void visit(Video video) {
        if (video.getFormat()=="mp4"){
            this.listeMP4=this.listeMP4+" "+video.getNom();
        }

    }



    public String getListeMP4(){
        return this.listeMP4;
    }
/////////////////////////////////////////////


}
