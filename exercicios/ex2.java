package exercicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("A soma do número é: " + (num1+num2));
        System.out.println("A subtração do número é: " + (num1-num2));
        System.out.println("A multplicação do número é: " + (num1*num2));
        System.out.println("A divisão do número é: " + (num1/num2));

    }
}
