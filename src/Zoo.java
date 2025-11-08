public class Zoo {
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    // ✅ Instruction 33 : Réduire le nombre de cages à 3
    public Zoo() {
        aquaticAnimals = new Aquatic[3]; // Changé de 10 à 3
        aquaticCount = 0;
    }

    // ✅ Instruction 32 : Modifier le type de retour de void et lever des exceptions
    public void addAquaticAnimal(Aquatic a) throws ZooFullException, InvalidAgeException {
        // ✅ Instruction 34 : Vérification de l'âge
        if (a.getAge() < 0) {
            throw new InvalidAgeException();
        }

        // ✅ Instruction 33 : Vérification de la capacité
        if (aquaticCount >= aquaticAnimals.length) {
            throw new ZooFullException();
        }

        // Ajout normal si tout est valide
        aquaticAnimals[aquaticCount++] = a;
    }

    // ✅ Instruction 26 : appel de swim() (inchangé)
    public void makeAllSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // ✅ Instruction 27 : profondeur maximale des pingouins (inchangé)
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

    // ✅ Instruction 28 : afficher le nombre par type (inchangé)
    public void displayCountByType() {
        int nbDolphins = 0, nbPenguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) nbDolphins++;
            if (aquaticAnimals[i] instanceof Penguin) nbPenguins++;
        }
        System.out.println("Nombre des Dauphins : " + nbDolphins);
        System.out.println("Nombre de pingouins : " + nbPenguins);
    }

    // Méthode pour obtenir le nombre actuel d'animaux
    public int getAnimalCount() {
        return aquaticCount;
    }
}