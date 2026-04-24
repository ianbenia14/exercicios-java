package exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero 1:");        
        int num1 = scanner.nextInt(); 

        System.out.print("Digite o numero 1:");        
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        
        System.out.println("A soma final é: " + soma);

    }
}
