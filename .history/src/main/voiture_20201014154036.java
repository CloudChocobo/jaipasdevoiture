/**
 *voiture
 */


public class voiture {
    String marque;
    String couleur;
    int niveauEssence;
    boolean reservoirVide;
    boolean reservee;

    public voiture (String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.niveauEssence = false;

    }
    public String getChaine() {
        return "marque " + this.marque + ", couleur: " + this.couleur;
    }    
}