package domain;

public class Human extends Mammal {
    private String name;
    private int id;

    public Human(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Human() {}

    public String getName() {
        System.out.println("Get name " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Set name" + name);
    }

    public int getId() {
        System.out.println("Get id " + id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Set id");
    }

    public void learn() {
        System.out.println("Learn");
    }

    public void work() {
        System.out.println("Work");
    }

    public void rest() {
        System.out.println("Rest");
    }
}
