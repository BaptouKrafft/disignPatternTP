package interpreteur;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        Video v1 = new Video(2018, "caisse", "JLA", "Video1.mov" , "mov");
        Video v3 = new Video(2018, "BAM", "JMP", "Video1.mp4" , "mp4");
        Video v2 =  new Video(2018, "Bass", "JMP", "Video2.mp4" , "mp4");
        Article a1 = new Article(2018, "Fosse", "Pierre", "art.txt");
        Article a3 = new Article(2018, "HI", "Pierre", "art1.txt");
        Article a2 = new Article(2018, "Boom", "JULA", "artus.txt");
        al.ajouter(p1, p2, p3,a1,a2,a3,v1,v2,v3);

        Adaptateur a=new Adaptateur(2015,"Premier Adaptateur" , p1, "Photo d'une magnifique Aurore boréale");

        String res1 = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, " +
                "Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}," +
                " Article{auteur='Pierre', annee=2018, nom='Fosse'}, Article{auteur='JULA', annee=2018, nom='Boom'}," +
                " Article{auteur='Pierre', annee=2018, nom='HI'}, Video{auteur='JLA', annee=2018, nom='caisse'}, " +
                "Video{auteur='JMP', annee=2018, nom='Bass'}, Video{auteur='JMP', annee=2018, nom='BAM'}]}";

        assert (al.toString().equals(res1)) : "Bug" ;
        assert(al.getNombreDePhoto()==3): "Bug";
        assert(al.getNombreDeVideo()==3): "Pb nb vid";
        assert(al.getNombreArticle()==3): "PB nb Article";
        assert(al.getAuteur("Pierre").equals(" Fosse HI")): "Pb consultation auteur";
        assert(al.getAuteur("John").equals("")): "Pb consultation auteur";
        assert(al.getMP4().equals(" Bass BAM")): "pb consultation type";

   }
}
