import java.util.Scanner;

public class ConversorDeMoneda {

    // Metodo para realizar la conversión de divisas
    public static void ConversorDeMoneda(String from, String to, Scanner scanner) {
        System.out.printf("Ingresa la cantidad en %s: ", from);
        double monto = scanner.nextDouble();

        // Llama al servicio para obtener la tasa de conversión
        CurrencyResponse response = HttpClientService.getConversionRate(from, to);

        // Si la respuesta es válida y exitosa, se realiza la conversión
        if (response != null && response.isSuccessful()) {
            double tasaDeCambio = response.getConversionRate();
            double resultado = tasaDeCambio * monto;

            // Imprime con 6 decimales la tasa de cambio
            System.out.printf("Tasa actual (%s -> %s): %.6f%n", from, to, tasaDeCambio);
            System.out.printf("Resultado: %.2f %s = %.2f %s%n", monto, from, resultado, to);
        } else {
            System.out.println("Error al obtener la tasa de cambio.");
        }
    }
}
