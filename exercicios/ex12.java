package exercicios;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoComImpostos = custoFabrica * (1 + 45.0 / 100);

        double custoFinal = custoComImpostos * (1 + 28.0 / 100);

        System.out.printf("Custo de fábrica:       R$ %.2f%n", custoFabrica);
        System.out.printf("Com impostos (45%%):     R$ %.2f%n", custoComImpostos);
        System.out.printf("Custo ao consumidor:    R$ %.2f%n", custoFinal);

        scanner.close();
    }
}