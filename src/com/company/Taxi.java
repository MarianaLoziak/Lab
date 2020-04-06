package com.company;

public class Taxi<T extends Person> extends Car<T> {
    public Taxi(String NumberPlate, int AmountOfSeats){
        super(NumberPlate,AmountOfSeats);
    }


}
