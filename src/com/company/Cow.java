package com.company;

public class Cow extends Animal implements State {

    private static int counter = 1;

    private final int cowNumber;

    public Cow() {
        super(AnimalState.IDLE);
        this.cowNumber = counter++;
    }

    @Override
    public String getAnimalIdentifier() {
        return String.format("Cow.N[%d]", cowNumber);
    }
}
