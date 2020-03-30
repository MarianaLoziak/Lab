package com.company;

abstract class Car<T extends Person> extends Vehicle<T> {
    public Car(String numberPlate, int amountOfSeats) {
        super(numberPlate, amountOfSeats);
    }
}
