
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroEstudiantes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("estudiantes.txt")
            );

            for (int i = 1; i <= 3; i++) {

                System.out.println("Estudiante " + i);

                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la calificacion: ");
                String calificacion = scanner.nextLine();

                escritor.write(nombre);
                escritor.newLine();

                escritor.write(calificacion);
                escritor.newLine();

                System.out.println("Datos guardados correctamente.\n");
            }

            escritor.close();

            System.out.println("Registro finalizado.");
            System.out.println("Datos guardados en estudiantes.txt");

        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }

        scanner.close();
    }
}
