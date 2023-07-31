package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDataReader {

	public static List<Element> xmlReader(String filepath)
			throws ParserConfigurationException, SAXException, IOException {

		// String filepath="C:\\Users\\SPURGE\\Documents\\marks.xml";
		File file = new File(filepath);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = dbf.newDocumentBuilder();
		Document doc = dbuilder.parse(file);
		doc.getDocumentElement().normalize();
		System.out.println(doc.getDocumentElement().getNodeName());
		NodeList nodelist = doc.getElementsByTagName("rollno");
		int nlength = nodelist.getLength();
		System.out.println(nlength);

		List<Element> listofEle = new ArrayList<>();

		for (int i = 0; i < nlength; i++) {
			Node node = nodelist.item(i);
			// List<> list=new ArrayList<>();
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				// System.out.println(element.getAttribute("rln") +
				// element.getAttribute("firstname"));
				listofEle.add(element);
//			   System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
//			   System.out.println(element.getElementsByTagName("lastname").item(0).getTextContent());
//			   System.out.println(element.getElementsByTagName("Mark").item(0).getTextContent());
//		   }
//				System.out.println("-----------------------");

			}
		}
		return listofEle;
	}
}
