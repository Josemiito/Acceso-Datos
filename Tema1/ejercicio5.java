import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ejercicio5 {
    public static void main(String[] args) {
        
        try{
            FileInputStream file = new FileInputStream("./davante.png");
            FileOutputStream filo = new FileOutputStream("./elhueso.png");
            int contador = 0;
            int data;
            long inicio1 = System.currentTimeMillis();
            while((data=file.read()) != -1){
                filo.write(data);
                contador++;
            }

            System.out.println("Se han copiado " + contador + " bytes");
            long final1 = System.currentTimeMillis();
            System.out.println("FileInputStream ha " + (final1-inicio1) + " ms");

            file.close();
            filo.close();

            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("./davante.png"));
            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("./elhueso.png"));

            byte[] buffered = new byte[4096];
            int bytesLeidos;
            int contador1 = 0;

            while ((bytesLeidos = entrada.read(buffered)) != -1) {
                salida.write(buffered, 0, bytesLeidos);
                contador1++;
            }

            long msdespues = System.currentTimeMillis();
            salida.close();
            entrada.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
