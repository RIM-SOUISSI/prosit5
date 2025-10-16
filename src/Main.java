public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Dolphin d1 = new Dolphin("Flippy", 5, "Mer", 25);
        Dolphin d2 = new Dolphin("Blue", 8, "Océan", 30);
        Penguin p1 = new Penguin("Pingu", 4, "Arctique", 50);
        Penguin p2 = new Penguin("Ice", 6, "Antarctique", 80);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        System.out.println("\n=== Tous les animaux nagent ===");
        zoo.makeAllSwim();

        System.out.println("\n=== Profondeur maximale des pingouins ===");
        System.out.println(zoo.getMaxPenguinDepth() + " mètres");

        System.out.println("\n=== Nombre d’animaux par type ===");
        zoo.displayCountByType();
    }
}
