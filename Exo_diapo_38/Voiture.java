public class Voiture {
    private String nom;
    private int puissance;
    private boolean estDemarre;
    private double vitesse;

    public Voiture(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
        this.estDemarre = false;
        this.vitesse = 0.0;
    }
    public int deQuellePuissance() {
        return puissance;
    }
    public void demarre() {
        estDemarre = true;
        System.out.println(nom + " est démarrée !");
    }
}
