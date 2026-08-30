import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a terceira nota: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        // Uso de parênteses para precedência explícita
        double media = (nota1 + nota2 + nota3) / 3.0;

        boolean aprovado = media >= 7.0;

        System.out.printf("Média: %.2f%n", media);
        if (aprovado) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}