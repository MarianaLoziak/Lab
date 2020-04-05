package com.company;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CashRegister_Test {

    @Test
    void TakeReceipt_Test() {
        Cash_Register cash=new Cash_Register();
        cash.AddProduct("apple",2);
        cash.AddProduct("toilet paper", 1);
        cash.AddProduct("milk",3);
        cash.AddProduct("milk",4);
        cash.AddProduct("apple",3);
        cash.AddProduct("bread",1);
        Map<String,Integer>  map=cash.TakeReceipt();
        assertEquals(5,map.get("apple"));
        assertEquals(7,map.get("milk"));


    }
}