package com.company;

public class Main {

    public static void main(String[] args) {


        Charmander charmander = new Charmander("John", "fire", 10, true, true);
        Bulbasaur bulbasaur = new Bulbasaur("Zenith", "Grass", 17, false, true);

        System.out.println(bulbasaur.getCry());
        System.out.println(charmander.getCry());
    }
}
