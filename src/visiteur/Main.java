package visiteur;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        Video v1 = new Video(2014, "Poulet", "NSM", "vid1.mov", "mov");
        Video v2 = new Video(1989, "Goulag", "MSN", "vid2.mp4", "mp4");
        Video v3= new Video(1997, "Tondeuse", "MSN", "viDO.mp4", "mp4");
        Article a1 = new Article(1789, "Vadrouille", "MSN", "art.txt");
        Article a3 = new Article(1789, "Vladimir", "JPP", "art2.txt");
        Article a2 = new Article(1665, "Crakow", "JP2", "art1.txt");

        al.ajouter(p1, p2, p3,v1,v2,v3,a1,a2,a3);


        VisitNbPhotos photos=new VisitNbPhotos();
        al.accept(photos);

        VisitAuteur auteurVisiteur=new VisitAuteur("JPP");

        al.accept(auteurVisiteur);

        VisitMP4 mp4= new VisitMP4();

        al.accept(mp4);
        System.out.println(al.toString());
        VisitAndSuppress vas=new VisitAndSuppress("NSM");
        al.acceptSuppress(vas);
        System.out.println(al.toString());

        System.out.println("Somme "+photos.getSomme());
        System.out.println("Articles From JPP "+":"+auteurVisiteur.getListeArticles()+":");
        System.out.println("Video Format mp4"+":"+mp4.getListeMP4()+":");
        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}, " +
                "Video{auteur='NSM', annee=2014, nom='Poulet'}, Video{auteur='MSN', annee=1989, nom='Goulag'}, " +
                "Article{auteur='JPP', annee=1789, nom='Vadrouille'}, Article{auteur='JP2', annee=1665, nom='Crakow'}]}";

        assert (al.toString().equals(res)) : "Bug" ;
        assert (photos.getSomme()==3) : "NB Photo" ;
        assert (auteurVisiteur.getListeArticles().equals(" Vadrouille Vladimir")):"articles";
        assert (mp4.getListeMP4().equals(" Goulag Tondeuse")): "PB format mp4";

    }
}
