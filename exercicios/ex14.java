package exercicios;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero1 = scanner.nextInt(); 

        System.out.println("Informe outro número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é o maior");
        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é o maior");
        } else {
            System.out.println("Os números são iguais");
        }

        scanner.close();
    }
}