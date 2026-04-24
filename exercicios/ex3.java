package exercicios;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida pelo automóve (em kms): ");
        double kms = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros): ");
        double litros = scanner.nextDouble();

        System.out.println("consumo médio de: " + kms/litros + "kms por litro");
    }
}
