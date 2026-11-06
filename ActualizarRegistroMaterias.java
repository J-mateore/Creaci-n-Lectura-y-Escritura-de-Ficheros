import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ActualizarRegistroMaterias {
    public static void main(String[] args) {
        String nombreArchivo = "materias.txt";

        // Abrir el fichero existente configurando el FileWriter en modo de adición (append = true)[cite: 4]
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            
            // Añadir dos nuevas asignaturas al final del archivo usando newLine()[cite: 4]
            escritor.write("Arquitectura de Computadoras");
            escritor.newLine();
            escritor.write("Matematica Discreta");
            escritor.newLine();

            System.out.println("Se han añadido las nuevas asignaturas correctamente sin perder las anteriores.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al modificar el archivo: " + e.getMessage());
        }
    }
}