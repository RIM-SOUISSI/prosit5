public abstract class Aquatic {
    private String name;
    private int age;
    private String habitat;

    public Aquatic(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Méthode abstraite => toutes les sous-classes doivent la redéfinir
    public abstract void swim();

    // Getters
    public String getName()
    { return name;
    }
    public int getAge() {
        return age; }
    public String getHabitat() {
        return habitat; }

    // Redéfinition de equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;//instanceof pour verifier le type Aquatic//
        Aquatic other = (Aquatic) obj;
        return this.name.equals(other.name)
                && this.age == other.age
                && this.habitat.equals(other.habitat);
    }

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + "), âge: " + age + ", habitat: " +habitat;
    }
}
