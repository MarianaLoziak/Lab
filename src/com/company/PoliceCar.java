package com.company;

public class PoliceCar<T extends Policeman> extends Car<T> {
    public PoliceCar(String NumberPlate, int AmountOfSeats){
        super(NumberPlate,AmountOfSeats);
    }

}
