package domain;

public class Animal {
    private String speciesName;
    private int age;
    private Boolean mammal;
    private Type gender;

    public Animal(String speciesName, int age, Boolean mammal, Type gender) {
        this.speciesName = speciesName;
        this.age = age;
        this.mammal = mammal;
        this.gender = gender;
    }

    public Animal() {}

    public Type getGender() {
        System.out.println("Gender " + gender);
        return gender;
    }


    public void setGender(Type gender) {
        this.gender = gender;
        System.out.println("Set gender " + gender);
    }


    public int getAge() {
        System.out.println("Age " + age);
        return age;
    }


    public void setAge(int age) {
        this.age = age;
        System.out.println("Set age");
    }

    public Boolean isMammal() {
        System.out.println("Mammal " + mammal);
        return mammal;
    }


    public void setMammal(Boolean mammal) {
        this.mammal = mammal;
        System.out.println("Set mammal " + mammal);
    }


    public String getSpeciesName() {
        System.out.println("Species name " + speciesName);
        return speciesName;
    }


    public void setSpeciesName(String name) {
        this.speciesName = name;
        System.out.println("Set species name " + name);
    }


    public void eat() {
        System.out.println("Eat");
    }


    public void communicate() {
        System.out.println("Communicate");
    }


    public void breathe() {
        System.out.println("Breathe");
    }


    public void sleep() {
        System.out.println("Sleep");
    }


    public static class Type {
    }
}
