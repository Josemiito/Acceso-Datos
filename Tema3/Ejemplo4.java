import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4 {
    public static void main(String[] args) {
        
        try{
            FileReader file = new FileReader("./archivo.txt");
            int data;
            while ((data = file.read()) != -1) {
                System.out.println((char)data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("esto siempre se ejecuta");
        }

    }    
}
