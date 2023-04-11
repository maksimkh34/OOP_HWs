public class Radio implements Speakable {
    @Override
    public String speak() {
        return "Радио играет";
    }

    @Override
    public String toString() {
        return speak();
    }
}
