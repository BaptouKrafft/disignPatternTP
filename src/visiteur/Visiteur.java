package visiteur;

public interface Visiteur {
    public int visitElement(Album a);

    public int visitElement(Photo p);

    public String visitElementAuthor(Album a);

    public String visitElementAuthor(Article a);



}
