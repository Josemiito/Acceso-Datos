import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejemplo3 {
    public static void main(String[] args) {
        
        FileReader lector = null;
        try {
            lector = new FileReader("./prueba.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int data = 0;
        try {
            while ((data = lector.read()) != -1) {
                System.out.println((char)data);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            data = lector.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(data);
        try {
            lector.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
         try {
            FileWriter fw = new FileWriter("./escritura.txt");
            fw.write("Esto es un ejemplo de escriturá");
            fw.close();
            System.out.println("Fichero escrito correctamente.");
        } catch (Exception e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
