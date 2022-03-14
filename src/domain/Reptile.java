package domain;


/**
 * The class Reptile extends animal
 */
public class Reptile extends Animal {
    private Boolean runOnWater;


    /**
     *
     * Reptile
     *
     * @param runOnWater  the run on water
     */
    public Reptile(Boolean runOnWater) {

        this.runOnWater = runOnWater;
    }



    /**
     *
     * Gets the run on water
     *
     * @return the run on water
     */
    public Boolean getRunOnWater() {

        System.out.println("Get run on water " + runOnWater);
        return runOnWater;
    }



    /**
     *
     * Sets the run on water
     *
     * @param waterRunner  the water runner
     */
    public void setRunOnWater(Boolean waterRunner) {

        this.runOnWater = waterRunner;
        System.out.println("Set run on water " + waterRunner);
    }



    /**
     *
     * Lay eggs
     *
     */
    public void layEggs() {

        System.out.println("Lay eggs");
    }



    /**
     *
     * Shed the skin
     *
     */
    public void shedTheSkin() {

        System.out.println("Shed the skin");
    }

}
