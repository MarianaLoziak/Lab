package com.company;

import java.util.ArrayList;
import java.util.List;

public class Road {
    public List< Vehicle> carsInRoad = new ArrayList<>();
    public int getCountOfHumans(){
        int c=0;
        for(Vehicle car: carsInRoad){
            c+=car.OccupiedSeats();
        }
        return  c;
    }
    public void addCarToRoad( Vehicle car){
        carsInRoad.add(car);
    }

}
