package exercicios;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o valor depositado: ");
        double valorDepositado = scanner.nextDouble();

        double rendimento = valorDepositado * (0.07 / 100);
        double valorFinal  = valorDepositado + rendimento;

        System.out.printf("%nValor depositado:  R$ %.2f%n", valorDepositado);
        System.out.printf("Rendimento (0,07%%): R$ %.2f%n", rendimento);
        System.out.printf("Valor após 1 mês:   R$ %.2f%n", valorFinal);
    
        scanner.close();
    }
}
