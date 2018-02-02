package com.company;

public class Pokemon {

    private String name;
    private String type;
    private int rareity;

    public Pokemon(String name, String type, int rareity) {
        this.name = name;
        this.type = type;
        this.rareity = rareity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRareity() {
        return rareity;
    }

    public void setRareity(int rareity) {
        this.rareity = rareity;
    }
    public String getCry(){
        return "no cry";
    }
}
