package exercicios;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de câmbio!");

        System.out.print("Informe a cotação atual (1 US$ = R$?): ");
        double cotacao = scanner.nextDouble();

        System.out.print("Quantos dólares (US$) você possui? ");
        double dolares = scanner.nextDouble();

        double reais = dolares * cotacao; 

        System.out.printf("US$ %.2f equivale a R$ %.2f%n", dolares, reais);

        scanner.close();
    }
}