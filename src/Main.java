public class Main {
    public static void main(String[] args) {
        System.out.println("=== Instanciation avec constructeurs par défaut ===");
        Aquatic aquatic1 = new Aquatic();
        Terrestrial terrestrial1 = new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        System.out.println("Objets créés avec succès !");
        System.out.println("\n=== Instanciation avec constructeurs paramétrés ===");

        Aquatic aquatic2 = new Aquatic("Poisson", "Poisson-clown", 2, false, "Récif corallien");
        Terrestrial terrestrial2 = new Terrestrial("Félin", "Lion", 5, true, 4);
        Dolphin dolphin2 = new Dolphin("Delphinidés", "Dauphin commun", 8, true, "Océan", 45.5f);
        Penguin penguin2 = new Penguin("Sphéniscidés", "Manchot empereur", 3, false, "Antarctique", 500.0f);

        System.out.println("Objets créés avec constructeurs paramétrés !");

        // Instruction 23 : Test de toString()
        System.out.println("\n=== Affichage avec toString() ===");
        System.out.println("Aquatic: " + aquatic2.toString());
        System.out.println("Terrestrial: " + terrestrial2.toString());
        System.out.println("Dolphin: " + dolphin2.toString());
        System.out.println("Penguin: " + penguin2.toString());

        // Instruction 24 : Test du comportement de nage
        System.out.println("\n=== Comportement de nage ===");
        Aquatic aquaticTest = new Aquatic("Poisson", "Thon", 3, false, "Océan");
        aquaticTest.swim();
        dolphin2.swim();
        penguin2.swim();

        System.out.println("\n=== Test polymorphique ===");
        Aquatic[] aquaticAnimals = {aquaticTest, dolphin2, penguin2};

        for (Aquatic animal : aquaticAnimals) {
            animal.swim(); // Comportement différent selon le type réel
        }
    }
}