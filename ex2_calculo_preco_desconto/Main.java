import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.print("Percentual de desconto: ");
        double percentual = Double.parseDouble(scanner.nextLine());

        double desconto = preco * percentual / 100.0;
        double precoFinal = preco - desconto;

        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço final: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}