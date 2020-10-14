package co.simplon;

public class Agence {
    String ville;

    public Agence (String ville) {
        this.ville = ville;

    }

    String getChaine(){
        return "Agence de " + this.ville;
    }
}
