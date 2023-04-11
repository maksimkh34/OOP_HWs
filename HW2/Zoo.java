import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> Animals = new ArrayList<>();
    private Radio radio = new Radio();
    public Zoo(ArrayList<Animal> ans)
    {
        Animals = ans;
    }

    public Zoo(Animal ... a)
    {
        Animals.addAll(List.of(a));
    }

    public void addAnimal (Animal an)
    {
        Animals.add(an);
    }

    void call()
    {
        for(Animal a : Animals)
        {
            System.out.println(a.speak());
        }
    }

    void showAll()
    {
        for(Animal a : Animals)
        {
            System.out.println(a);
        }
    }

    List<Speakable> getSpeakable()
    {
        List<Speakable> list1 = new ArrayList<>(Animals);
        list1.add(radio);
        return list1;
    }

    List<Walkable> getWalkers()
    {
        List<Walkable> list1 = new ArrayList<>();
        for(Animal a : Animals)
        {
            if(a instanceof Walkable)
            {
                list1.add((Walkable) a);
            }
        }
        return list1;
    }
}
