package com.company;

public class Bulbasaur extends Pokemon{

    private boolean isWeakToLightning;
    private boolean isStrongToEarth;

    public Bulbasaur(String name, String type, int rareity, boolean isWeakToLightning, boolean isStrongToEarth) {
        super(name, type, rareity);
        this.isWeakToLightning = isWeakToLightning;
        this.isStrongToEarth = isStrongToEarth;
    }

    public boolean isWeakToLightning() {
        return isWeakToLightning;
    }

    public void setWeakToLightning(boolean weakToLightning) {
        isWeakToLightning = weakToLightning;
    }

    public boolean isStrongToEarth() {
        return isStrongToEarth;
    }

    public void setStrongToEarth(boolean strongToEarth) {
        isStrongToEarth = strongToEarth;
        }

    @Override
    public String getCry() {
        return "roar";

    }
}

