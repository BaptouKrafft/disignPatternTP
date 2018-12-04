package visiteur;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        Video v1 = new Video(2014, "Poulet", "NSM", "vid1.mov");
        Video v2 = new Video(1989, "Goulag", "MSN", "vid2.jpg");
        Article a1 = new Article(1789, "Vadrouille", "JPP", "art.txt");
        Article a3 = new Article(1789, "Vladimir", "JPP", "art2.txt");
        Article a2 = new Article(1665, "Crakow", "JP2", "art1.txt");
        al.ajouter(p1, p2, p3,v1,v2,a1,a2,a3);


        VisitNbPhotos photos=new VisitNbPhotos();
        photos.visitElement(al);

        VisitAuteur va=new VisitAuteur("JPP");
        va.visitElementAuthor(al);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}, " +
                "Video{auteur='NSM', annee=2014, nom='Poulet'}, Video{auteur='MSN', annee=1989, nom='Goulag'}, " +
                "Article{auteur='JPP', annee=1789, nom='Vadrouille'}, Article{auteur='JP2', annee=1665, nom='Crakow'}]}";

        assert (al.toString().equals(res)) : "Bug" ;
        assert (photos.getS()==3) : "NB Photo" ;
        assert (va.getListeArticles().equals("Vadrouille Vladimir ")):"articles";

    }
}
