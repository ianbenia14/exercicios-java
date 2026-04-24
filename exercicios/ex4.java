package exercicios;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String vendedor = scanner.nextLine();
                
        System.out.println("Digite o salário fixo do vendedor " + vendedor + ":");
        double salario = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas por " + vendedor + " no mês (em dinheiro):");
        double vendas = scanner.nextDouble();   
        
        double salarioFinal = salario + vendas * 0.15;

        System.out.println("Nome do vendedor: " + vendedor);
        System.out.println("Salário fixo:" + salario);
        System.out.println("Salário final do mês:" + salarioFinal);


    }
}
