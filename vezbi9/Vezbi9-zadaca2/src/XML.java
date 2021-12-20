import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XML {
    public void createXMLFile(String filename, Vraboten[] vraboteni){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Vraboteni");
            document.appendChild(root);

            for (int i = 0; i<vraboteni.length; i++){
                Element vraboten = document.createElement("Vraboten");
                root.appendChild(vraboten);

                Element ime = document.createElement("Ime");
                vraboten.appendChild(ime);

                Element prezime = document.createElement("Prezime");
                vraboten.appendChild(prezime);

                Element plata = document.createElement("Plata");
                vraboten.appendChild(plata);

                ime.appendChild(document.createTextNode(vraboteni[i].getIme()));
                prezime.appendChild(document.createTextNode(vraboteni[i].getPrezime()));
                plata.appendChild(document.createTextNode(vraboteni[i].getPlata()));
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filename));

            transformer.transform(source, result);
            System.out.println("Fajlot e kreiran, imeto e: " + filename);
            System.out.println("Fajlot e zachuvan.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
