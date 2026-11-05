import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {
    public static void main(String[] args) {
        // 1. Crear un objeto Scanner para ingresar información por teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitar al usuario que escriba un mensaje
        System.out.print("Escribe el mensaje que deseas guardar: ");
        String mensaje = scanner.nextLine();

        try {
            // 3. Utilizar FileWriter con el parámetro true para conservar la información anterior y agregar al final
            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            // 4. Utilizar el método write() para guardar el mensaje (añadimos un salto de línea para orden)
            escritor.write(mensaje + "\n");

            // 5. Cerrar el archivo utilizando close()
            escritor.close();

            // 6. Mostrar un mensaje indicando que la información se guardó correctamente
            System.out.println("¡La información se guardó correctamente en estudiantes.txt!");

        } catch (IOException e) {
            // 7. Controlar posibles errores mediante try-catch
            System.out.println("Ocurrió un error al intentar escribir en el archivo.");
            e.printStackTrace();
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
