import java.io.File;
import java.io.IOException;

public class ejercicio0 {
    public static void main(String[] args) {

        File fichero = new File("./crearFichero.txt");
        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado " + fichero.getName());
            } else {
                System.out.println("No se puede crear el fichero");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}