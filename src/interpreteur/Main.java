package interpreteur;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Album al = new Album(2018, "Album Senja");
        Photo p1  = new Photo(2018, "Aurore Boréale", "JMP", "Photo1.jpg");
        Photo p2  = new Photo(2018, "Trek", "JMP", "Photo2.jpg");
        Photo p3  = new Photo(2018, "Fjord", "SM", "Photo3.jpg");
        Video v1 = new Video(2018, "caisse", "JMP", "Video1.mov" , "mov");
        Video v3 = new Video(2018, "BAM", "JMP", "Video1.mp4" , "mp4");
        Video v2 =  new Video(2018, "Bass", "JMP", "Video2.mp4" , "mp4");
        Article a1 = new Article(2018, "Fosse", "Pierre", "art.txt");
        Article a3 = new Article(2018, "HI", "Pierre", "art1.txt");
        Article a2 = new Article(2018, "Boom", "John", "artus.txt");
        al.ajouter(p1, p2, p3,a1,a2,a3,v1,v2,v3);

        String res = "Album{als=[Photo{auteur='JMP', annee=2018, nom='Aurore Boréale'}, Photo{auteur='JMP', annee=2018, nom='Trek'}, Photo{auteur='SM', annee=2018, nom='Fjord'}]}";
        assert (al.toString().equals(res)) : "Bug" ;
        assert(al.getNombreDePhoto()==3): "Bug";
        assert(al.getNombreDeVideo()==2): "Pb nb vid";
        assert(al.getNombreArticle()==2): "PB nb Article";
        assert(al.getAuteur("Pierre")=="Fosse HI"): "Pb consultation auteur";
        assert(al.getAuteur("John")=="Boom"): "Pb consultation auteur";
        assert(al.getMP4()=="Bass BAM"): "pb consultation type";
    }
}
