package test;

import domain.Animal;
import domain.Human;


/**
 * The class Test class
 */
public class TestClass {

    /**
     *
     * Main
     *
     * @param args  the args
     */
    public static void main(String[] args) {

        Human human = new Human("Name", 1);
        human.getGender();
        human.setGender(new Animal.Type());
        human.getAge();
        human.setAge(0);
        human.isMammal();
        human.setMammal(true);
        human.getSpeciesName();
        human.setSpeciesName("Human");
        human.eat();
        human.communicate();
        human.breathe();
        human.sleep();

        human.hairOrFur();
        human.setHairOrFur(true);
        human.isPredator();
        human.setPredator(false);
        human.hunt();

        human.getName();
        human.setName("Name");
        human.getId();
        human.setId(0);
        human.learn();
        human.work();
        human.rest();
    }
}
