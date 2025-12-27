public class VoitureElectrique extends Voiture {
    private String typeChargeur;
    public VoitureElectrique(String nom, int puissance, boolean estDemarre, 
                            double vitesse, String typeChargeur) {
        super(nom, puissance); 
        this.typeChargeur = typeChargeur;
    }
    public void afficher() {
        System.out.println("Voiture Electrique avec chargeur : " + typeChargeur);
    }
}
