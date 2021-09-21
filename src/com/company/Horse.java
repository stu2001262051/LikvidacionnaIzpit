package com.company;

public class Horse extends Animal implements State {

    private static int counter = 1;

    private final int horseNumber;

    public Horse() {
        super(AnimalState.IDLE);
        this.horseNumber = counter++;
    }

    @Override
    public void eating() {
        super.eating();
        super.notifyOwner();
    }

    @Override
    public String getAnimalIdentifier() {
        return String.format("Horse.N[%d]", horseNumber);
    }
}
