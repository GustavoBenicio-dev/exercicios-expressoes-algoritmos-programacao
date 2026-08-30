import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperatura em °C: ");
        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.printf("%.2f°C equivale a %.2f°F%n", celsius, fahrenheit);

        scanner.close();
    }
}