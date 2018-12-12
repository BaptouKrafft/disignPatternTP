package visiteur;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


public class SupportDeComm {
    private String nomPhoto;
    private int annee;
    private String auteur;
    private String fichier;
    private String texte;

    public SupportDeComm(String nom, String fichier, int annee, String texte) {
        this.nomPhoto = nom;
        this.fichier = fichier;
        this.annee = annee;
        this.texte = texte;
    }

    public String getNom() {
        return this.nomPhoto;
    }

    public int getDate() {
        return this.annee;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public String getFichier() {
        return this.fichier;
    }

    public String getTexte() {
        return this.texte;
    }
}
