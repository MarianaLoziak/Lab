package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoadTest {

    @Test
    public void roadTest(){
        Road road=new Road();
        Taxi<Person> taxi =new Taxi<>("AT1546AA",10);
        PoliceCar<Policeman> policeCar = new PoliceCar<>("BT6351AX",5);
        Bus<Person> bus = new Bus<>("TT6548TT",18);
        FireTruck<Fireman> fireTruck= new FireTruck<>("AA2355AA",3);
        Person p = new Person("Person",20);
        Policeman pm = new Policeman("Policeman",40);
        Fireman fm = new Fireman ("Fireman",35);
        road.addCarToRoad(taxi);
        road.addCarToRoad(bus);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(fireTruck);
        taxi.TakeSeat(p);
        taxi.TakeSeat(pm);
        taxi.TakeSeat(fm);
        bus.TakeSeat(p);
        bus.TakeSeat(pm);
        bus.TakeSeat(fm);
        fireTruck.TakeSeat(fm);
        policeCar.TakeSeat(pm);

        taxi.BoardPassenger(pm);

        assertEquals(7,road.getCountOfHumans());
    }
}