package interpreteur;

import java.util.ArrayList;
import java.util.Iterator;

public class Album extends Media implements Iterable<Media>{
    protected ArrayList<Media> als ;

    public Album(int d, String nom) {
        super(d, nom);
        this.als = new ArrayList<>(10);
    }

    public void ajouter(Media... s) {
        for (Media sc : s)
            this.als.add(sc);
    }




    int getNombreDePhoto(){
        int S=0;
        for (Media m : this.als)
            S=S+m.getNombreDePhoto();
        return S;
    }

    @Override
    String getType() {
        return null;
    }

    String getMP4(){
        String liste="";
        for (Media m : this.als){
            if (m.getType()=="mp4"){
                liste = liste + " " + m.getNom();
            }
        }
        return liste;
    }

    int getNombreArticle(){
        int S=0;
        for (Media m : this.als)
            S=S+m.getNombreArticle();
        return S;
    }

    @Override
    String getAuteur() {
        return null;
    }

    int getNombreDeVideo(){
        int S=0;
        for (Media m : this.als)
            S=S+m.getNombreDeVideo();
        return S;
    }

    String getNom(){
        return "";
    }

    String getAuteur(String auteur){
        String liste="";
        for (Media m : this.als){
            if (m.getAuteur()==auteur){
                if (m.getNombreArticle()==1){
                    liste = liste + " " + m.getNom();
                }
            }
        }
        return liste;
    }

    @Override
    public String toString() {
        return "Album{" +
                "als=" + als +
                '}';
    }

    @Override
    public Iterator<Media> iterator() {
        return this.als.iterator();
    }

}