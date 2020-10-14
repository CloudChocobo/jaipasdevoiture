package co.simplon;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }


    static void alimenterEnVoiture(){
        
        Voiture renault = new Voiture("Renault","rouge");
        System.out.println(renault.getChaine());

    }


   
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Agence agenceRennes = new Agence("Rennes");
        System.out.println(agenceRennes.getChaine());
        alimenterEnVoiture();
    }


}

