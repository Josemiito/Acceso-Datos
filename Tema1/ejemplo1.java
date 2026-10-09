import java.io.File;

public class ejemplo1 {
    public static void main(String[] args) {
        
        File fichero0 = new File("./crearFichero.txt");
        File carpeta = new File("./", "backup");
        carpeta.mkdir();

        File destino = new File("./backup/fichero_movido.txt");
        
        if (fichero0.renameTo(destino)) {
            System.out.println("Fichero movido correctamente");
        }else{
            System.out.println("No se ha podido mover el fichero");
        }
    }
}
