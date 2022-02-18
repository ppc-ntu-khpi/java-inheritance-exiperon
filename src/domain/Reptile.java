package domain;

public class Reptile extends Animal {
    private Boolean runOnWater;

    public Reptile(Boolean runOnWater) {
        this.runOnWater = runOnWater;
    }


    public Boolean getRunOnWater() {
        System.out.println("Get run on water " + runOnWater);
        return runOnWater;
    }


    public void setRunOnWater(Boolean waterRunner) {
        this.runOnWater = waterRunner;
        System.out.println("Set run on water " + waterRunner);
    }


    public void layEggs() {
        System.out.println("Lay eggs");
    }


    public void shedTheSkin() {
        System.out.println("Shed the skin");
    }

}
