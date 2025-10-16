public class Penguin extends Aquatic {
    private double divingDepth;

    public Penguin(String name, int age, String habitat, double divingDepth) {
        super(name, age, habitat);
        this.divingDepth = divingDepth;
    }

    public double getDivingDepth() { return divingDepth; }

    @Override
    public void swim() {
        System.out.println(getName() + " nage à une profondeur de " + divingDepth + " mètres !");
    }
}
