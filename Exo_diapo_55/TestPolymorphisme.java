public class TestPolymorphisme {
    public static void main(String[] args) {
        Vehicule[] garage = {new Train(), new Voiture(), new Bateau()};

        for (Vehicule v : garage) {
            v.seDeplacer();
        }
    }
}

