package exercicios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atribua um valor númerico para A:");
        double a = scanner.nextDouble();

        System.out.println("Atribua um valor númerico para B:");
        double b = scanner.nextDouble();

        double antigoA = a;
         a = b;
         b = antigoA;

        System.out.println("Valor de A (trocado):" + a);
        System.out.println("Valor de B (trocado):" + b);

    }
}
