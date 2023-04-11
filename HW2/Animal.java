public abstract class Animal implements Speakable{
    private final String name;
    private final boolean alive = true;
    public abstract String feed();
    
    public Animal(String name)
    {
        this.name = name;
    }

    public Animal()
    {
        this.name = "Безымянный";
    }
    @Override
    public String toString() {
        return String.format("Кличка: %s, живой: %b, корм: %s", name, alive, this.feed());
    }
}
