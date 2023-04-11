public class FlyingSquirrel extends Herbivore implements Walkable, Flyable{
    public FlyingSquirrel(String name_)
    {
        super(name_);
    }


    @Override
    public int fly_speed() {
        return 60;
    }

    @Override
    public String speak() {
        return "-";
    }

    @Override
    public int speed() {
        return 30;
    }
}
