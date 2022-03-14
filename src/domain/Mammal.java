package domain;


/**
 * The class Mammal extends animal
 */
public class Mammal extends Animal {
    private Boolean skinCover;
    private Boolean predator;


    /**
     *
     * Mammal
     *
     * @param skinCover  the skin cover
     * @param predator  the predator
     */
    public Mammal(Boolean skinCover, Boolean predator) {

        this.skinCover = skinCover;
        this.predator = predator;
    }



    /**
     *
     * Mammal
     *
     */
    public Mammal() {}

    public Boolean hairOrFur() {

        System.out.println("Hair or fur " + skinCover);
        return true;
    }



    /**
     *
     * Sets the hair or fur
     *
     * @param skinCover  the skin cover
     */
    public void setHairOrFur(Boolean skinCover) {

        this.skinCover = skinCover;
        System.out.println("Set hair or fur " + skinCover);
    }



    /**
     *
     * Is predator
     *
     * @return Boolean
     */
    public Boolean isPredator() {

        System.out.println("Is predator " + predator);
        return false;
    }



    /**
     *
     * Sets the predator
     *
     * @param predator  the predator
     */
    public void setPredator(Boolean predator) {

        this.predator = predator;
        System.out.println("Set predator");
    }



    /**
     *
     * Hunt
     *
     */
    public void hunt() {

        System.out.println("Hunt");
    }
}
