public abstract class Predator extends Mammal {
    public Predator(String name_)
    {
        super(name_);
    }

    @Override
    public String feed() {
        return "Мясо";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
