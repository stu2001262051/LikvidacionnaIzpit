package com.company;

public abstract class Animal implements State, Observable {

    private Observer owner;
    private AnimalState animalState;

    public Animal(AnimalState animalState) {
        this.animalState = animalState;
    }

    public abstract String getAnimalIdentifier();

    public AnimalState getState() {
        return animalState;
    }

    @Override
    public void idle() {
        this.animalState = AnimalState.IDLE;
        outputState();
    }

    @Override
    public void sleeping() {
        this.animalState = AnimalState.SLEEPING;
        outputState();
    }

    @Override
    public void eating() {
        this.animalState = AnimalState.EATING;
        outputState();
    }

    @Override
    public void outputState() {
        System.out.printf("[%s] is in [%s] state%n", getAnimalIdentifier(), this.animalState);
    }

    @Override
    public void setOwnership(Observer owner) {
        this.owner = owner;
    }

    @Override
    public void removeOwnership() {
        this.owner = null;
    }

    @Override
    public void notifyOwner() {
        if (owner != null) {
            owner.update(getAnimalIdentifier());
        }
    }
}
