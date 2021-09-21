package com.company;

public interface Observer {

    void update(String animalIdentifier);
    void addAnimal(Observable animal);
    void removeAnimal(Observable animal);
}
