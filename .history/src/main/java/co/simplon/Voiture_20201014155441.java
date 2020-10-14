package co.simplon;

/**
 *voiture
 */


public class Voiture {
    String marque;
    String couleur;
    int niveauEssence;
    boolean reservoirVide;
    boolean reservee;

    public Voiture (String marque, String couleur){
        this.marque = marque;
        this.couleur = couleur;
        this.reservee = false;

    }
    public String getChaine(){
        return "marque: " + this.marque + ", couleur: " + this.couleur;
    }    
}