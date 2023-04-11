import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cow("Корова №1"));
        zoo.addAnimal(new Cow("Корова №2"));
        zoo.addAnimal(new Bear("Медведь №1"));

        zoo.call();
        zoo.showAll();

        System.out.println(zoo.getSpeakable());

        System.out.println();

        ArrayList<Integer> speeds = new ArrayList<>();

        for(int i = 0; i < zoo.getWalkers().size(); i++)
        {
            speeds.add(zoo.getWalkers().get(i).speed());
        }

        int max = speeds.get(0);

        for(int speed : speeds)
        {
            if (speed > max)
            {
                max = speed;
            }
        }

        System.out.println(max);
    }
}