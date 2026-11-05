import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        // Objeto de tipo File apuntando a "curso.txt"
        File archivo = new File("curso.txt");

        try {
            // Intentar crear el archivo con createNewFile()
            boolean creado = archivo.createNewFile();

            // Comprobar si se creó o ya existía
            if (creado) {
                System.out.println("¡El archivo se ha creado exitosamente!");
            } else {
                System.out.println("El archivo ya existe previamente en el directorio.");
            }

            // Mostrar el nombre del archivo utilizando getName()
            System.out.println("Nombre del archivo: " + archivo.getName());

        } catch (IOException e) {
            // Controlar posibles errores de entrada/salida
            System.out.println("Ocurrió un error al intentar crear el archivo.");
            e.printStackTrace();
        }
    }
}