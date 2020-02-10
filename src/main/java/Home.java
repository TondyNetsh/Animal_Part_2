import java.util.ArrayList;

public class Home {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void adoptPet(Animal animal){
        animals.add(animal);
    }
    public void makeAllSounds(){
        for(Animal a: animals){
            a.sound();
        }
    }
}
