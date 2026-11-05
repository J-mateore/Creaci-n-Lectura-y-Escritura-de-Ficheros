import java.io.File;

public class EliminarFichero {
    public static void main(String[] args) {
        // 1 y 2. Crear un objeto de tipo File indicando el nombre del archivo que se desea eliminar
        File archivo = new File("estudiantes.txt");

        // 3 y 4. Utilizar el método delete() para intentar eliminar y comprobar si se realizó correctamente
        if (archivo.delete()) {
            // 5. Si el archivo se eliminó, mostrar un mensaje de confirmación
            System.out.println("¡El archivo se ha eliminado correctamente!");
        } else {
            // 6. Si no se pudo eliminar, mostrar un mensaje indicando el problema
            System.out.println("No se pudo eliminar el archivo. Es posible que no exista o que esté siendo utilizado.");
        }
    }
}
