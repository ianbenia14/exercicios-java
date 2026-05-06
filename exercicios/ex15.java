package exercicios;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Está no intervalo entre 100 e 200");
        } else {
            System.out.println("Está fora do intervalo");
        }

        scanner.close();
    }
}