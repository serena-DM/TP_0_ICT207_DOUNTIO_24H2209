public class TestVoiture {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Mercedes", 150);
        System.out.println("Puissance : " + maVoiture.deQuellePuissance() + " CV");
        
        maVoiture.demarre();
    }
}
