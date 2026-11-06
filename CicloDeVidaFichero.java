import java.io.File;
import java.io.IOException;

public class CicloDeVidaFichero {
    public static void main(String[] args) {
        // Construir un objeto File que represente la ruta "datos/temporal.txt"
        File archivoTemporal = new File("datos/temporal.txt");

        try {
            File carpeta = archivoTemporal.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            // Consultar el estado del archivo mediante exists() y crearlo si no está disponible
            if (!archivoTemporal.exists()) {
                boolean creado = archivoTemporal.createNewFile();
                if (creado) {
                    System.out.println("Archivo temporal creado exitosamente en: " + archivoTemporal.getPath());
                }
            } else {
                System.out.println("El archivo temporal ya se encontraba disponible.");
            }

            // Implementar fase de validación con variable de control booleana
            boolean confirmarBorrado = true; 

            // Utilizar el método delete() exclusivamente si la confirmación es verdadera
            if (confirmarBorrado) {
                boolean eliminado = archivoTemporal.delete();
                System.out.println("Resultado de la operación de eliminación (delete): " + eliminado);
            } else {
                System.out.println("La operación de borrado fue cancelada por el usuario.");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S durante el ciclo de vida del archivo: " + e.getMessage());
        }
    }
}