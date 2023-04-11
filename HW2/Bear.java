public class Bear extends Predator implements Walkable{
    public Bear(String name_)
    {
        super(name_);
    }

    @Override
    public String speak() {
        return "Рык";
    }

    @Override
    public int speed() {
        return 35;
    }

}
