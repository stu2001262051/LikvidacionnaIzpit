package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements Observer {

    private final List<Observable> animals;
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
        this.animals = new ArrayList<>();
    }

    @Override
    public void update(String animalIdentifier) {
        System.out.printf("[%s] received a notification that [%s] is feeding%n", this.playerName, animalIdentifier);
    }

    @Override
    public void addAnimal(Observable animal) {
        if (animal != null) {
            animal.setOwnership(this);
            this.animals.add(animal);
        }
    }

    @Override
    public void removeAnimal(Observable animal) {
        if (animal != null) {
            animal.removeOwnership();
            this.animals.remove(animal);
        }
    }
}
