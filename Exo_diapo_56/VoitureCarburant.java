public class VoitureCarburant extends Voiture {
    private String typeCarburant;

    public VoitureCarburant(String nom, int puissance, String typeCarburant) {
        super(nom, puissance);
        this.typeCarburant = typeCarburant;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Type : Carburant");
        System.out.println("Carburant : " + typeCarburant);
    }
}
