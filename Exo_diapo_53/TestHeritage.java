public class TestHeritage {
    public static void main(String[] args) {
        VoitureElectrique maVoitureElectrique = new VoitureElectrique(
            "Tesla", 500, false, 0.0, "Supercharger V3"
        );
        
        maVoitureElectrique.demarre(); 
        maVoitureElectrique.afficher(); 
    }
}
