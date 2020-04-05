package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cash_Register {

    Map<String, Integer> receipt = new TreeMap<String, Integer>();

    public void AddProduct(String product, int amount){
        if(receipt.containsKey(product)){
            receipt.put(product,receipt.get(product)+amount);
        }
        else{
            receipt.put(product,amount);
        }
    }

    public Map<String, Integer> TakeReceipt(){
        Map<String, Integer> temp = new TreeMap<>();
        temp.putAll(receipt);
        receipt.clear();

        for(Map.Entry<String, Integer> pair: temp.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key+":"+value);
        }
        return temp;
    }


}
