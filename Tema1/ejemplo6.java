import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ejemplo6{
    public static void main(String[] args) {
        
        try {
            RandomAccessFile file = new RandomAccessFile("./abecedario.txt", "rw");
            file.seek(5);
            System.out.println("Puntero antes de leer: " + file.getFilePointer()); //Escribira 5
            int unbyte = file.read();
            System.out.println("Puntero despues de leer: " + file.getFilePointer()); //Escribira 6
            System.out.println((char)unbyte);
            file.write('0');
            System.out.println("Puntero despues de leer: " + file.getFilePointer()); //Escribira 7
        } catch (Exception e) {
            
            e.printStackTrace();
        }

    }
}