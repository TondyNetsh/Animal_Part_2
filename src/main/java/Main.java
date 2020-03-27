public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();

        home.makeAllSounds(); //This doesn't do anything
        home.adoptPet(dog);
        home.makeAllSounds();
        dog.setName("Rax");
        dog.eats();

        System.out.println("=========================");

        home.adoptPet(cat);
        home.makeAllSounds();
        cat.setName("Stormy");
        cat.eats();
    }
}
