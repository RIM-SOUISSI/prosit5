public class Zoo {
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
        aquaticCount = 0;
    }

    // ✅ Instruction 25 : ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic a) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = a;
        } else {
            System.out.println("Zoo plein !");
        }
    }

    // ✅ Instruction 26 : appel de swim()
    public void makeAllSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // ✅ Instruction 27 : profondeur maximale des pingouins
    public double getMaxPenguinDepth() {
        double maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                double depth = ((Penguin) aquaticAnimals[i]).getDivingDepth();
                if (depth > maxDepth) maxDepth = depth;
            }
        }
        return maxDepth;
    }

    // ✅ Instruction 28 : afficher le nombre par type
    public void displayCountByType() {
        int nbDolphins = 0, nbPenguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) nbDolphins++;
            if (aquaticAnimals[i] instanceof Penguin) nbPenguins++;
        }
        System.out.println("Nombre de dauphins : " + nbDolphins);
        System.out.println("Nombre de pingouins : " + nbPenguins);
    }
}
