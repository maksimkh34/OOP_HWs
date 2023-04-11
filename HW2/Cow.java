public class Cow extends Herbivore implements Walkable{
    public Cow(String name_)
    {
        super(name_);
    }

    @Override
    public String speak() {
        return "Муу! ";
    }

    @Override
    public int speed() {
        return 20;
    }
}
