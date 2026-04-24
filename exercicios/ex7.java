package exercicios;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperatura em graus Celsius: ");
        double c = scanner.nextDouble();

        double f = (9*c+160)/5;

        System.out.println("Temperatura em graus Fahrenheit: " + f);

    }
}