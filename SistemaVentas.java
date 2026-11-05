
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SistemaVentas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalAcumulado = 0;
        String nombre;

        try {
            // Abrir archivo en modo append
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("ventas.txt", true)
            );

            while (true) {

                System.out.print("Ingrese el nombre del producto (o fin para terminar): ");
                nombre = scanner.nextLine();

                // Verificar si desea terminar
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = scanner.nextDouble();

                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = scanner.nextInt();

                scanner.nextLine();

                // Calcular subtotal
                double subtotal = precio * cantidad;

                // Aplicar descuento si corresponde
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                // Calcular total a pagar
                double total = subtotal - descuento;

                // Acumular las ventas
                totalAcumulado += total;

                // Mostrar resultados
                System.out.println("\n--- RESUMEN DE VENTA ---");
                System.out.println("Producto: " + nombre);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);
                System.out.println("------------------------\n");

                // Guardar venta en el archivo
                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: $" + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Subtotal: $" + subtotal);
                escritor.newLine();

                escritor.write("Descuento: $" + descuento);
                escritor.newLine();

                escritor.write("Total a pagar: $" + total);
                escritor.newLine();

                escritor.write("-------------------------");
                escritor.newLine();
            }

            // Guardar total acumulado
            escritor.write("TOTAL ACUMULADO DE LAS VENTAS: $" + totalAcumulado);
            escritor.newLine();

            escritor.write("================================");
            escritor.newLine();

            escritor.close();

            System.out.println("Registro de ventas finalizado.");
            System.out.println("Total acumulado: $" + totalAcumulado);
            System.out.println("Datos guardados en ventas.txt");

        } catch (IOException e) {
            System.out.println("Error al guardar las ventas: " + e.getMessage());
        }

        scanner.close();
    }
}

