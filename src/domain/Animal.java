package domain;


/**
 * The class Abstract animal
 */
public abstract class Animal {
    private String speciesName;
    private int age;
    private Boolean mammal;
    private Type gender;


    /**
     *
     * Animal
     *
     * @param speciesName  the species name
     * @param age  the age
     * @param mammal  the mammal
     * @param gender  the gender
     */
    public Animal(String speciesName, int age, Boolean mammal, Type gender) {

        this.speciesName = speciesName;
        this.age = age;
        this.mammal = mammal;
        this.gender = gender;
    }



    /**
     *
     * Animal
     *
     */
    public Animal() {}

    public Type getGender() {

        System.out.println("Gender " + gender);
        return gender;
    }



    /**
     *
     * Sets the gender
     *
     * @param gender  the gender
     */
    public void setGender(Type gender) {

        this.gender = gender;
        System.out.println("Set gender " + gender);
    }



    /**
     *
     * Gets the age
     *
     * @return the age
     */
    public int getAge() {

        System.out.println("Age " + age);
        return age;
    }



    /**
     *
     * Sets the age
     *
     * @param age  the age
     */
    public void setAge(int age) {

        this.age = age;
        System.out.println("Set age");
    }


    /**
     *
     * Is mammal
     *
     * @return Boolean
     */
    public Boolean isMammal() {

        System.out.println("Mammal " + mammal);
        return mammal;
    }



    /**
     *
     * Sets the mammal
     *
     * @param mammal  the mammal
     */
    public void setMammal(Boolean mammal) {

        this.mammal = mammal;
        System.out.println("Set mammal " + mammal);
    }



    /**
     *
     * Gets the species name
     *
     * @return the species name
     */
    public String getSpeciesName() {

        System.out.println("Species name " + speciesName);
        return speciesName;
    }



    /**
     *
     * Sets the species name
     *
     * @param name  the name
     */
    public void setSpeciesName(String name) {

        this.speciesName = name;
        System.out.println("Set species name " + name);
    }



    /**
     *
     * Eat
     *
     */
    public void eat() {

        System.out.println("Eat");
    }



    /**
     *
     * Communicate
     *
     */
    public void communicate() {

        System.out.println("Communicate");
    }



    /**
     *
     * Breathe
     *
     */
    public void breathe() {

        System.out.println("Breathe");
    }



    /**
     *
     * Sleep
     *
     */
    public void sleep() {

        System.out.println("Sleep");
    }


    public static class Type {
    }
}
