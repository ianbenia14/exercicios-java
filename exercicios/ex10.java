package exercicios;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Loja Mamão com Açúcar!");
        System.out.print("Informe o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        int numeroParcelas = 5;
        double valorParcela = valorCompra / numeroParcelas;

        System.out.println("─────────────────────────────────");
        System.out.printf("Valor total:      R$ %.2f%n", valorCompra);
        System.out.printf("Parcelado em:     %d x sem juros%n", numeroParcelas);
        System.out.printf("Valor da parcela: R$ %.2f%n", valorParcela);
        System.out.println("─────────────────────────────────");

        scanner.close();
    }
}