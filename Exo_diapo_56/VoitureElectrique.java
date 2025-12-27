public class VoitureElectrique extends Voiture {
    private String typeChargeur;
    public VoitureElectrique(String nom, int puissance, String typeChargeur) {
        super(nom, puissance); 
        this.typeChargeur = typeChargeur;
    }

    
    public void afficher() {
        super.afficher(); 
        System.out.println("Type : Electrique | Chargeur : " + typeChargeur);
    }
}
