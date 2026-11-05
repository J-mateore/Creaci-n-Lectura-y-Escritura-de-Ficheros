
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroProductos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Abrir el archivo en modo append (agregar)
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("productos.txt", true)
            );

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad disponible: ");
            int cantidad = scanner.nextInt();

            // Calcular el valor total
            double total = precio * cantidad;

            // Guardar los datos en el archivo
            escritor.write("Producto: " + nombre);
            escritor.newLine();

            escritor.write("Precio: $" + precio);
            escritor.newLine();

            escritor.write("Cantidad: " + cantidad);
            escritor.newLine();

            escritor.write("Valor total: $" + total);
            escritor.newLine();

            escritor.write("-------------------------");
            escritor.newLine();

            // Cerrar el archivo
            escritor.close();

            System.out.println("\nProducto registrado correctamente.");
            System.out.println("Valor total: $" + total);

        } catch (IOException e) {
            System.out.println("Error al guardar el producto: " + e.getMessage());
        }

        scanner.close();
    }
}
