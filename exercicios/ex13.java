 package exercicios;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = scanner.nextDouble();

        if (numero > 10) {
            System.out.println("Seu número é maior que 10");
        }
        else{
            System.out.println("Menor que 10");
        }
        
        scanner.close();
    }
}