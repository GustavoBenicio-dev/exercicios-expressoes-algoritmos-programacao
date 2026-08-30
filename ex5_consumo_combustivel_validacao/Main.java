import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância percorrida (km): ");
        double distancia = Double.parseDouble(scanner.nextLine());
            
        System.out.print("Litros consumidos: ");
        double litros = Double.parseDouble(scanner.nextLine());

        System.out.print("Preço por litro (R$): ");
        double precoLitro = Double.parseDouble(scanner.nextLine());

        // Validação com operadores relacionais e lógicos (&&)
        boolean valido = (distancia > 0) && (litros > 0) && (precoLitro > 0) && (litros != 0) && (distancia != 0);

        if (valido) {
            double consumoMedio = distancia / litros;
            double custoTotal = litros * precoLitro;
            double custoKm = custoTotal / distancia;

            System.out.printf("Consumo médio: %.2f Km/l%n", consumoMedio);
            System.out.printf("Custo total: R$ %.2f%n", custoTotal);
            System.out.printf("Custo por Km: R$ %.2f%n", custoKm);
        } else {
            System.out.println("Dados inválidos! Certifique-se de que todos os valores são positivos e que distância e litros são diferentes de zero.");
        }

        scanner.close();
    }
}