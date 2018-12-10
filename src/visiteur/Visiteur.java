package visiteur;

public interface Visiteur {



    public void visit(Album a);

    public void visit(Photo photo);

    public void visit(Article article);

    public void visit(Video video);

}
