package com.company;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class VehicleTest {
    Person p=new Person("Tom",15);
    Person p1=new Person("Person1",20);
    Person p2=new Person("Person2",40);
    Policeman pm=new Policeman("Bill",40);
    Fireman fm=new Fireman("Dan",30);

    Taxi<Person> taxi =new Taxi<>("AT5556AA",4);
    Bus<Person> bus =new Bus<>("AT5556AA",4);
    PoliceCar<Policeman> pcar =new PoliceCar<>("AT5556AA",4);
    FireTruck<Fireman> ftruck =new FireTruck<>("AT5556AA",4);

    @Test
    public void TakeSeat_Taxi() {

        assertEquals(true,taxi.TakeSeat(p));
        assertEquals(true,taxi.TakeSeat(pm));
        assertEquals(true,taxi.TakeSeat(fm));
    }

    @Test
    public void TakeSeat_Bus() {

        assertEquals(true,bus.TakeSeat(p));
        assertEquals(true,bus.TakeSeat(pm));
        assertEquals(true,bus.TakeSeat(fm));
    }

    @Test
    public void TakeSeat_PoliceCar() {

        assertEquals(true,pcar.TakeSeat(pm));
    }

    @Test
    public void TakeSeat_FireTruck() {

        assertEquals(true,ftruck.TakeSeat(fm));
    }

    @Test
    public void OccupiedSeats_BoardPassenger_Taxi(){
        taxi.TakeSeat(p);
        taxi.TakeSeat(pm);
        taxi.TakeSeat(fm);
        taxi.BoardPassenger(p);
        taxi.BoardPassenger(fm);
        assertEquals(1,taxi.OccupiedSeats());
    }

    @Test
    public void OccupiedSeats_BoardPassenger_Bus(){
        bus.TakeSeat(p);
        bus.TakeSeat(pm);
        bus.TakeSeat(fm);
        bus.BoardPassenger(pm);
        assertEquals(2,bus.OccupiedSeats());
    }

    @Test
    public void OccupiedSeats_BoardPassenger_PoliceCar(){
        pcar.TakeSeat(pm);
        pcar.BoardPassenger(pm);
        assertEquals(0,pcar.OccupiedSeats());
    }

    @Test
    public void OccupiedSeats_BoardPassenger_FireTruck(){
        ftruck.TakeSeat(fm);
        ftruck.BoardPassenger(fm);
        assertEquals(0,ftruck.OccupiedSeats());
    }


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void BoardPassenger_NoSuchPassenger_Exception(){
        thrown.expect(CarException.class);
        thrown.expectMessage("There is no such a passenger in the vehicle!");
        bus.TakeSeat(pm);
        bus.BoardPassenger(p);
    }

    @Test
    public void TakeSeat_NotEnoughSeats_Exception(){
        thrown.expect(CarException.class);
        thrown.expectMessage("Not enough seats!");
        taxi.TakeSeat(p);
        taxi.TakeSeat(p1);
        taxi.TakeSeat(p2);
        taxi.TakeSeat(pm);
        taxi.TakeSeat(fm);
    }
}