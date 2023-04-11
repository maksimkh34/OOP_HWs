public class Wolf extends Predator implements Speakable, Walkable{
    public Wolf(String name)
    {
        super(name);
    }

    @Override
    public String speak() {
        return "Уууу";
    }

    @Override
    public int speed() {
        return 45;
    }
}
