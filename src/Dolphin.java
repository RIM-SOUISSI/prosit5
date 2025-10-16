public class Dolphin extends Aquatic {
    private int speed;

    public Dolphin(String name, int age, String habitat, int speed) {
        super(name, age, habitat);
        this.speed = speed;
    }

    public int getSpeed() { return speed; }

    @Override
    public void swim() {
        System.out.println(getName() + " nage à une vitesse de " + speed + " km/h !");
    }
}
