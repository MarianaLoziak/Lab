package com.company;

public class FireTruck<T extends Fireman>  extends Car<T> {
    public FireTruck(String NumberPlate, int AmountOfSeats){
        super(NumberPlate,AmountOfSeats);
    }


}
