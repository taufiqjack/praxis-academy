package kasus;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Xml
 */
public class Xml {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement("ponsel");
            doc.appendChild(rootElement);

            Element smartphone = doc.createElement("smartphone");
            rootElement.appendChild(smartphone);

            Attr attr = doc.createAttribute("buatan");
            attr.setValue("apple");
            smartphone.setAttributeNode(attr);

            Element merkponsel = doc.createElement("merkponsel");
            Attr attrType = doc.createAttribute("tipe");
            attrType.setValue("iphone");
            merkponsel.setAttributeNode(attrType);
            merkponsel.appendChild(doc.createTextNode("iphone 12"));
            smartphone.appendChild(merkponsel);

            Element merkponsel1 = doc.createElement("merkponsel");
            Attr attrTipe1 = doc.createAttribute("tipe");
            attrTipe1.setValue("samsung");
            merkponsel1.setAttributeNode(attrTipe1);
            merkponsel1.appendChild(doc.createTextNode("samsung S10"));
            smartphone.appendChild(merkponsel1);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ponsel.xml"));
            transformer.transform(source, result);

            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
