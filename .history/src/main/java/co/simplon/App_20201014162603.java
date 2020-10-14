package co.simplon;
import java.util.ArrayList;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }


    static void alimenterEnVoiture(Agence agence){
        
        Voiture renault = new Voiture("Renault","rouge");
        System.out.println(renault.getChaine());
        Voiture ferrari = new Voiture("Ferrari","rouge");
        agence.ajouterVoiture(renault);
        agence.ajouterVoiture(ferrari);

    }


   
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Agence agenceRennes = new Agence("Rennes");
        System.out.println(agenceRennes.getChaine());
        alimenterEnVoiture(agenceRennes);
        agenceRennes.afficherStock();
    }


}

