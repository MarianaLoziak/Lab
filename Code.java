package com.company;
public class Code {
    public char Encode(int symbol, int key){
        return (char)(symbol+key);
    }

    public char Decode(int symbol, int key){
        return (char)(symbol-key);
    }
}
