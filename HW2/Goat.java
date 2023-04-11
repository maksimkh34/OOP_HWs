public class Goat extends Herbivore implements Speakable, Walkable{
    public Goat(String name)
    {
        super(name);
    }


    @Override
    public String speak() {
        return "Бее";
    }

    @Override
    public int speed() {
        return 15;
    }
}
