package com.company;

public class Charmander extends Pokemon{

    private boolean isWeakToWater;
    private boolean isStrongAgainstPlants;


    public Charmander(String name, String type, int rareity, boolean isWeakToWater, boolean isStrongAgainstPlants) {
        super(name, type, rareity);

        this.isWeakToWater = isWeakToWater;
        this.isStrongAgainstPlants = isStrongAgainstPlants;

    }

    public boolean isWeakToWater() {
        return isWeakToWater;
    }

    public void setWeakToWater(boolean weakToWater) {
        isWeakToWater = weakToWater;
    }

    public boolean isStrongAgainstPlants() {
        return isStrongAgainstPlants;
    }

    public void setStrongAgainstPlants(boolean strongAgainstPlants) {
        isStrongAgainstPlants = strongAgainstPlants;
    }
}
