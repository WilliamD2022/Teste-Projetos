package com.example.testecurso;

import java.util.Locale;

public class Exercicio1 {
    public static void main (String[]args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender ='F';

        double price = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;




        System.out.println("Products:");
        System.out.printf(""+ product1 +", which price is  "+"$ %.2f%n", price);
        System.out.println(""+ product2 +", which price is " + price2 +"\r\n");  //"\r\n" >>> Pula linha

        System.out.println("Record: " + age +" years old, code " + code + " and gender: " + gender +"\r\n");

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf( "Rouded (theree decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
        Locale.setDefault(Locale.US);



        //System.out.printf("%.4f%n", x);
    
}
}
