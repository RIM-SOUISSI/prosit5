public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Dolphin d1 = new Dolphin("Flippy", 5, "Mer", 25);        // Valide
        Dolphin d2 = new Dolphin("Blue", 8, "Océan", 30);        // Valide
        Dolphin d3 = new Dolphin("NegativeAge", -2, "Océan", 20); // Âge négatif
        Penguin p1 = new Penguin("Pingu", 4, "Arctique", 50);    // Valide
        Penguin p2 = new Penguin("Ice", 6, "Antarctique", 80);   // Valide (dépassera la capacité)
        Penguin p3 = new Penguin("Extra", 3, "Pôle Nord", 60);   // Dépassement capacité


        Aquatic[] animalsToAdd = {d1, d2, d3, p1, p2, p3};

        for (Aquatic animal : animalsToAdd) {
            try {
                zoo.addAquaticAnimal(animal);
                System.out.println(" Animal ajouté avec succès : " + animal.getName());
            } catch (ZooFullException e) {
                System.out.println(" Erreur : " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println(" Erreur : " + e.getMessage());
            } finally {

                System.out.println("Nombre total d'animaux dans le zoo : " + zoo.getAnimalCount());
                System.out.println("---");
            }
        }

        System.out.println("\n=== Affichage des animaux qui nagent ===");
        zoo.makeAllSwim();

        System.out.println("\n=== Profondeur maximale des pingouins ===");
        System.out.println(zoo.getMaxPenguinDepth() + " mètres");

        System.out.println("\n=== Catégorie des animaux par type ===");
        zoo.displayCountByType();
    }
}