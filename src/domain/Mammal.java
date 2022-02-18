package domain;

public class Mammal extends Animal {
    private Boolean skinCover;
    private Boolean predator;

    public Mammal(Boolean skinCover, Boolean predator) {
        this.skinCover = skinCover;
        this.predator = predator;
    }

    public Mammal() {}

    public Boolean hairOrFur() {
        System.out.println("Hair or fur " + skinCover);
        return true;
    }


    public void setHairOrFur(Boolean skinCover) {
        this.skinCover = skinCover;
        System.out.println("Set hair or fur " + skinCover);
    }


    public Boolean isPredator() {
        System.out.println("Is predator " + predator);
        return false;
    }


    public void setPredator(Boolean predator) {
        this.predator = predator;
        System.out.println("Set predator");
    }


    public void hunt() {
        System.out.println("Hunt");
    }
}
