package com.company;

public class Main {

    public static void main(String[] args) {
        // Written with the assumption that one animal can have exactly one owner and that one player can own many animals
        Player gosho = new Player("Gosho");
        Player tosho = new Player("Tosho");
        Player sasho = new Player("Sasho");

        Animal cow1 = new Cow();
        Animal cow2 = new Cow();
        Animal horse1 = new Horse();
        Animal horse2 = new Horse();

        gosho.addAnimal(cow1);
        gosho.addAnimal(horse1);

        tosho.addAnimal(cow2);
        sasho.addAnimal(horse2);

        cow1.sleeping();
        cow2.eating();

        horse1.sleeping();
        horse2.sleeping();
        horse2.eating();
        horse1.eating();
        horse1.idle();
        horse1.eating();
    }
}
