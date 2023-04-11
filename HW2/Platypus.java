public class Platypus extends Animal implements Walkable{
    public Platypus(String name_)
    {
        super(name_);
    }

    @Override
    public String speak() {
        return "";
    }

    @Override
    public String feed() {
        return "Рыба, трава";
    }

    @Override
    public int speed() {
        return 5;
    }
}
