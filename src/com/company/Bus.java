package com.company;

public class Bus<T extends Person> extends Vehicle<T> {
    public Bus(String NumberPlate, int AmountOfSeats) {
        super(NumberPlate, AmountOfSeats);
    }
}
