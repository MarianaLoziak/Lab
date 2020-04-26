package com.company;

import java.io.*;

public class Main {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {


        String str1="";
        String str2="";
        String str3="";
        Code code=new Code();

        FileReader reader=null;
        try {

            reader=new FileReader("filename.txt");
            int symbol = reader.read();
            while (symbol != -1) {
                str2=str2+(char)symbol;
                str1=str1+code.Encode(symbol,'!');
                symbol = reader.read();
            }
        }
        catch(IOException ex) {
            System.out.println("Error!");
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(ANSI_CYAN+"-----------------Readed from file---------------------"+ANSI_RESET);
        System.out.println(str2);
        System.out.println(ANSI_CYAN+"-----------------Encoded------------------------------"+ANSI_RESET);
        System.out.println(str1);


        FileWriter writer=null;
        try
        {
            writer = new FileWriter("Coded_text.txt", false);
            writer.write(str1);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }




        try {
            reader=new FileReader("Coded_text.txt");
            int symbol = reader.read();
            while (symbol != -1) {
                str3=str3+code.Decode(symbol,'!');
                symbol = reader.read(); // Читаем символ
            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(ANSI_CYAN+"-----------------Decoded------------------------------"+ANSI_RESET);
        System.out.println(str3);
    }
}
