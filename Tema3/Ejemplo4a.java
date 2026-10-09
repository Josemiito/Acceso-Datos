import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4a{
    public static void main(String[] args) throws FileNotFoundException {
        
        FileReader file = new FileReader("archivo.txt");
        int data;
        try {
            while ((data = file.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}