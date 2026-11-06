import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorAsignaturas {
    public static void main(String[] args) {
        String nombreArchivo = "materias.txt";

        // Configurar flujo de salida con BufferedWriter y FileWriter[cite: 3]
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            
            // Listado de asignaturas
            String[] asignaturas = {
                "Programacion Orientada a Objetos",
                "Estructuras de Datos",
                "Calculo Diferencial e Integral",
                "Fisica General",
                "Base de Datos I"
            };

            // Escribir cada asignatura empleando newLine() para asegurar una línea independiente[cite: 3]
            for (String asignatura : asignaturas) {
                escritor.write(asignatura);
                escritor.newLine();
            }

            System.out.println("El archivo '" + nombreArchivo + "' ha sido creado y poblado exitosamente.");

        } catch (IOException e) {
            // Controlar errores potenciales de escritura mediante IOException[cite: 3]
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
