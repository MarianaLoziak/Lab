package com.company;

import java.time.LocalDateTime;
import java.util.*;

 abstract class Vehicle <T extends Person>{
    String NumberPlate;
    int AmountOfSeats;
    ArrayList<T> Passengers=new ArrayList<T>() ;


    public Vehicle(String NumberPlate, int AmountOfSeats ){
        this.NumberPlate=NumberPlate;
        this.AmountOfSeats=AmountOfSeats;
    }

    boolean TakeSeat(T person){
        if(Passengers.size()<AmountOfSeats){
            Passengers.add(person);
            return true;
        }
        else{
            throw new CarException("Not enough seats!");
        }
    }

    boolean BoardPassenger(T person){
        if(Passengers.contains(person)){
            Passengers.remove(person);
            return true;
        }
        else{
            throw new CarException("There is no such a passenger in the vehicle!");
        }

    }
    public int GetMax(){
        return AmountOfSeats;
    }

    public int OccupiedSeats(){
        return Passengers.size();
    }
}
