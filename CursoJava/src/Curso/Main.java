package Curso;

import java.util.Locale;

public class Main {
	
	public static void main(String[]args) {

		//Marcadores de variaveis
		//%f= ponto flutuante
		//%d = inteiro
		//%s= texto
		//%n = quebra de linha
		
		int y = 32;
		double x = 10.04345;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println(y);
		
		System.out.println("bom dia!!");
		Locale.setDefault(Locale.US);
		System.out.println("RESULTADO = " + x + " METROS ");  //exemplo de contatenação
		System.out.printf("RESULTADO = %.2f, METROS%n", x);   // exemplo de contatenação com varios elementos de escritas com printf

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}
	

	
		
		
	}

