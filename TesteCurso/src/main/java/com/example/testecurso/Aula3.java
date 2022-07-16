package com.example.testecurso;
import java.util.Locale;
import java.util.Scanner;

// exemplo de entrada de dados
public class Aula3 {

//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//         Scanner sc = new Scanner(System.in);
//
//         double x;
//         x = sc.nextDouble();
//         System.out.printf("voce digitou: %.2f%n ", + x);
//
//
//
//         sc.close();
//
//
//
//    }


//    public static void main (String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        char x;
//        x = sc.next().charAt(0);
//        System.out.println("voce digitou: " + x);
//
//        sc.close();
//
//    }




//    public static void main (String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        String x;
//        int y;
//        double z;
//        x = sc.next();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//        System.out.println("Dados Digitados:");
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//        sc.close();
//
//    }


    //fora da aula teste
//    public static void main (String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int x;
//        int y;
//
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        System.out.println("Insira o Ano Atual:");
//        x = sc.nextInt();
//        System.out.println("isira a data de ano de nascimento");
//       y = sc.nextInt();
//        System.out.println();
//        System.out.println("você tem :  "+ x + " - " + y + " = "+ (x - y));
//
//        sc.close();


//


    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         int x;
        String s1, s2 , s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    sc.close();

}
}
