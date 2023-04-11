public class Kite extends Predator implements Flyable, Walkable{

    public Kite(String name_) {
        super(name_);
    }

    @Override
    public int fly_speed() {
        return 65;
    }

    @Override
    public String speak() {
        return "??";
    }

    @Override
    public int speed() {
        return 15;
    }
}
