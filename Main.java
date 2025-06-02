import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú de opciones dentro de un bucle do-while para seguir mostrando el menú hasta que el usuario decida salir
        do {
            System.out.println("\n=== CONVERSOR DE MONEDAS ===");
            System.out.println("1. USD a COP ==> Dolares Americanos a Pesos Colombianos");
            System.out.println("2. COP a USD ==> Pesos Colombianos a Dolares Americanos");
            System.out.println("3. EUR a USD ==> Euros a Dolares Americanos");
            System.out.println("4. USD a EUR ==> Dolares Americanos a Euros");
            System.out.println("5. GBP a JPY ==> Libras Esterlinas a Yen Japones");
            System.out.println("6. JPY a GBP ==> Yen Japones a Libras Esterlinas");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();



            // Estructura switch para llamar al conversor con el par de monedas correspondiente
            switch (opcion) {
                case 1:
                    ConversorDeMoneda.ConversorDeMoneda("USD", "COP", scanner);
                    break;
                case 2:
                    ConversorDeMoneda.ConversorDeMoneda("COP", "USD", scanner);
                    break;
                case 3:
                    ConversorDeMoneda.ConversorDeMoneda("EUR", "USD", scanner);
                    break;
                case 4:
                    ConversorDeMoneda.ConversorDeMoneda("USD", "EUR", scanner);
                    break;
                case 5:
                    ConversorDeMoneda.ConversorDeMoneda("GBP", "JPY", scanner);
                    break;
                case 6:
                    ConversorDeMoneda.ConversorDeMoneda("JPY", "GBP", scanner);
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 7);  // Repite hasta que se seleccione la opción de salir

        scanner.close();  // Cierra el Scanner para liberar recursos
    }
}
