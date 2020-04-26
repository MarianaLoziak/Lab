package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {

    Code code=new Code();

    @Test
    void EncodeTest(){

        assertEquals('a',code.Encode('A',' '));
    }

    @Test
    void DecodeTest(){

        assertEquals('A',code.Decode('a',' '));
    }

    @Test
    void EncodeDecodeTest_String(){
        String str="Hello! This string should be encoded.";
        String output="";
        String result="";

        for(char c:str.toCharArray()){
            output=output+code.Encode(c,'a');
        }

        for(char c:output.toCharArray()){
            result=result+code.Decode(c,'a');
        }

        assertEquals(str,result);
    }
}