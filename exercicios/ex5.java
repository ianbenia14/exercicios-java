package exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.println("Digite a nota da Prova 1: ");
        double p1 = scanner.nextDouble();
        System.out.println("Digite a nota da Prova 2: ");
        double p2 = scanner.nextDouble();
        System.out.println("Digite a nota da Prova 3: ");
        double p3 = scanner.nextDouble();

        double media = (p1+p2+p3)/3;

        System.out.println("Nome do aluno: " + aluno);
        System.out.println("Média do aluno: " + media);



    }
}
