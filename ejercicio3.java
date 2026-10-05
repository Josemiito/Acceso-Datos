import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        try {
            String abecedario = "abcdefghijklmnñopqrstuvwxyz";
            FileWriter fichero = new FileWriter("datos.txt");
            fichero.write(abecedario);
            fichero.close();
            Scanner sc = new Scanner(System.in);
            System.out.println("Indica la posicion ");
            int pos = sc.nextInt();
            System.out.println("Escriba un caracter ");
            char caracter = sc.next().charAt(0);
            RandomAccessFile random = new RandomAccessFile("datos.txt", "rw");
            random.seek(pos);
            random.write(caracter);
            System.out.println("La posicion actual es " + random.getFilePointer());
            random.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
