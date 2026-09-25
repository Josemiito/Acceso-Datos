import java.io.File;

public class ejemplo2 {
    public static void main(String[] args) {
        
        String nombreCarpeta = "NuevaCarpeta";
        File carpeta =  new File("./", nombreCarpeta);

        if (carpeta.exists()) {
            System.out.println("La carpeta " + carpeta.getName() + " ya existe");
        }
        else{
            carpeta.mkdir();
            System.out.println("Carpeta creada correctamente");
            System.out.println("Ruta absoluta " + carpeta.getAbsolutePath());
            System.out.println("Ruta relativa " + carpeta.getPath());
            System.out.println("Carpeta padre " + carpeta.getParent());
        }
    }
}
