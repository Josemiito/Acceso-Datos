import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        File archivo = new File("fichero2.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(archivo);

        NodeList equipos = doc.getElementsByTagName("equipo");

        for (int i = 0; i < equipos.getLength(); i++) {
            Element equipo = (Element) equipos.item(i);
            String nombreEquipo = equipo.getElementsByTagName("nombre").item(0).getTextContent();
            System.out.println("Equipo: " + nombreEquipo);

            NodeList jugadores = equipo.getElementsByTagName("jugador");
            for (int j = 0; j < jugadores.getLength(); j++) {
                Element jugador = (Element) jugadores.item(j);
                String nombreJugador = jugador.getElementsByTagName("nombre").item(0).getTextContent();
                System.out.println(" - " + nombreJugador);
            }
        }
    }
}
