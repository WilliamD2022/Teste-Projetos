package Curso;

import java.util.Locale;

public class exercicio2 {
	
 public static void main (String[]args) {
	
	String product1 = "computer";
	String product2 = "office desk";

	int age = 30;
	int code = 5290;
	char gender ='F';
	
	double price = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	
	System.out.println("Products:");
	System.out.printf("Computer, which price is  "+"$ %.2f%n", price);
	System.out.printf("Office desk, which price is "+"$ %.2f%n", price2);  //"\r\n" >>> Pula linha
	
	System.out.println("Record: " + age +" years old, code " + code + " and gender: " + gender +"\r\n");

	System.out.printf("Measue with eight decimal places: %.8f%n", measure);
	System.out.printf( "Rouded (theree decimal places): %.3f%n", measure);
	System.out.printf("US decimal point: %.3f%n", measure);
	 Locale.setDefault(Locale.US);
	
	//System.out.printf("%.4f%n", x);
	
}
}
