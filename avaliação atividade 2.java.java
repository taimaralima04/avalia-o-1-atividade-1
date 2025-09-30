import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = sc.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Conversão para Kelvin
        double kelvin = celsius + 273.15;

        // Exibindo os resultados
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        sc.close();
    }
}
