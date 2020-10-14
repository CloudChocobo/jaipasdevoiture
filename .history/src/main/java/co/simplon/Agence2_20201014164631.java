
import java.util.ArrayList;

    package co.simplon;

    public class Agence2{
        String ville;
        ArrayList<Voiture> stock;
        public Agence2 (String ville) {
            this.ville = ville;
            this.stock = new ArrayList<Voiture>();
        }
    
        void ajouterVoiture(Voiture voiture) {
            this.stock.add(voiture);
        }
            
        String getChaine(){
            return "Agence de " + this.ville;
            
        }
    
        void afficherStock(){
            for (Voiture voiture : stock) {
                System.out.println(voiture.getChaine());
            }
        }
    }
    