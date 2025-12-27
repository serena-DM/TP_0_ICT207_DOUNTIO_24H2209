public class TestDivision {
    public static void main(String[] args) {
        System.out.println("Résultat classe: " + Division.diviserClasse(10, 2));

        Division d = new Division();
        System.out.println("Résultat instance: " + d.diviserInstance(10, 2));
    }
}


