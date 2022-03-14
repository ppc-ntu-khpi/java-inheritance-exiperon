package domain;


/**
 * The class Human extends mammal
 */
public class Human extends Mammal {
    private String name;
    private int id;


    /**
     *
     * Human
     *
     * @param name  the name
     * @param id  the id
     */
    public Human(String name, int id) {

        this.name = name;
        this.id = id;
    }



    /**
     *
     * Human
     *
     */
    public Human() {}

    public String getName() {

        System.out.println("Get name " + name);
        return name;
    }


    /**
     *
     * Sets the name
     *
     * @param name  the name
     */
    public void setName(String name) {

        this.name = name;
        System.out.println("Set name" + name);
    }


    /**
     *
     * Gets the identifier
     *
     * @return the identifier
     */
    public int getId() {

        System.out.println("Get id " + id);
        return id;
    }


    /**
     *
     * Sets the identifier
     *
     * @param id  the id
     */
    public void setId(int id) {

        this.id = id;
        System.out.println("Set id");
    }


    /**
     *
     * Learn
     *
     */
    public void learn() {

        System.out.println("Learn");
    }


    /**
     *
     * Work
     *
     */
    public void work() {

        System.out.println("Work");
    }


    /**
     *
     * Rest
     *
     */
    public void rest() {

        System.out.println("Rest");
    }
}
