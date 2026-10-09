import java.io.RandomAccessFile;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Que asiento quieres comprar");
            int asiento = sc.nextInt() -1;
            if (asiento <= 20) {
                RandomAccessFile file = new RandomAccessFile("./asientos.txt", "rw");
                file.seek(asiento);
                System.out.println((char)asiento);
                file.write('C');
            }else{
                System.out.println("No existe el asiento");
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }    
}
