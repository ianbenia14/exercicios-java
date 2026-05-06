package exercicios;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o preço do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Por favor, informe o percentual de acréscimo (ex: 20 para 20%):");
        double percentual = scanner.nextDouble();

        double acrescimo = precoProduto * (percentual / 100);
        double venda = precoProduto + acrescimo;

        System.out.printf("Preço de custo:  R$ %.2f%n", precoProduto);
        System.out.printf("Acréscimo:       R$ %.2f%n", acrescimo);
        System.out.printf("Preço de venda:  R$ %.2f%n", venda);

        scanner.close();
    }
}