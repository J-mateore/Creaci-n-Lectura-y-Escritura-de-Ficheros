import java.io.File;
import java.io.IOException;

public class GestionMetadatosArchivo {
    public static void main(String[] args) {
        // Construir el objeto File con la ruta especificada[cite: 1]
        File archivo = new File("datos/prueba.txt");

        try {
            // Asegurarse de que la carpeta contenedora exista
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            // Comprobación previa y creación controlada mediante exists() y createNewFile()[cite: 1]
            if (archivo.exists()) {
                System.out.println("El archivo ya existe en el disco.");
            } else {
                boolean creado = archivo.createNewFile();
                if (creado) {
                    System.out.println("El archivo se ha creado exitosamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

            // Extracción de información y metadatos con getName() y getPath()[cite: 1]
            System.out.println("--- Metadatos del Archivo ---");
            System.out.println("Nombre del archivo (getName): " + archivo.getName());
            System.out.println("Ruta del archivo (getPath): " + archivo.getPath());

        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }
}
