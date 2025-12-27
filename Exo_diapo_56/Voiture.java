public class Voiture {
    private String nom;
    private int puissance;

    public Voiture(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    public void afficher() {
        System.out.println("Voiture : " + nom + " (" + puissance + " CV)");
    }
}
