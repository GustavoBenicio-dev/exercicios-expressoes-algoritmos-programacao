import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Peso 1: ");
        double p1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota 2: ");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Peso 2: ");
        double p2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota 3: ");
        double n3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Peso 3: ");
        double p3 = Double.parseDouble(scanner.nextLine());

        double media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);

        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 5.0 && media < 7.0) { // AND lógico com &&
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.printf("Média ponderada: %.2f%n", media);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}