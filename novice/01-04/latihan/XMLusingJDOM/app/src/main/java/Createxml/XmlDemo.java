package Createxml;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("--------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no : " + eElement.getAttribute("roolno"));
                    System.out.println(
                            "First Name : " + eElement.getElementsByTagName("firtname").item(0).getTextContent());
                    System.out.println(
                            "Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println(
                            "Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // try {
        // DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        // DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        // Document doc = dBuilder.newDocument();

        // Element rootElement = doc.createElement("cars");
        // doc.appendChild(rootElement);

        // Element supercar = doc.createElement("supercars");
        // rootElement.appendChild(supercar);

        // Attr attr = doc.createAttribute("company");
        // attr.setValue("Ferrari");
        // supercar.setAttributeNode(attr);

        // Element carname = doc.createElement("carname");
        // Attr attrType = doc.createAttribute("type");
        // attrType.setValue("formula one");
        // carname.setAttributeNode(attrType);
        // carname.appendChild(doc.createTextNode("Ferrari 101"));
        // supercar.appendChild(carname);

        // Element carname1 = doc.createElement("carname");
        // Attr attrType1 = doc.createAttribute("type");
        // attrType1.setValue("sports");
        // carname1.setAttributeNode(attrType1);
        // carname1.appendChild(doc.createTextNode("Ferrari 202"));
        // supercar.appendChild(carname1);

        // TransformerFactory transformerFactory = TransformerFactory.newInstance();
        // Transformer transformer = transformerFactory.newTransformer();
        // DOMSource source = new DOMSource(doc);
        // StreamResult result = new StreamResult(new File("~/Desktop/cars.xml"));
        // transformer.transform(source, result);

        // StreamResult consoleResult = new StreamResult(System.out);
        // transformer.transform(source, consoleResult);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}
