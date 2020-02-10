public class Animal {
    private String name;

    public String sound(){
        System.out.println("Barks");
        System.out.println("Meows");
        return null;
    }
    public String eats(){
        return "Food";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
