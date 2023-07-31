package Mainproject.simpleproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class Xmldatareader 
{
   //getting data from xmlfile
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		String filepath="C:\\Users\\SPURGE\\Documents\\marks.xml";
		File file=new File(filepath);
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder=dbf.newDocumentBuilder();
	   Document doc=dbuilder.parse(file);
	   doc.getDocumentElement().normalize();
	   System.out.println(doc.getDocumentElement().getNodeName());
	   NodeList nodelist=doc.getElementsByTagName("rollnu");
	   int nlength=nodelist.getLength();
	   System.out.println(nlength);
	   for(int i=0;i<nlength;i++) {
		   Node node=nodelist.item(i);
		   if(node.getNodeType()==Node.ELEMENT_NODE) {
			   Element element=(Element)node;
			   System.out.println(element.getAttribute("rln"));
			   System.out.println(element.getElementsByTagName("firstname").item(0).getTextContent());
			   System.out.println(element.getElementsByTagName("lastname").item(0).getTextContent());
			   System.out.println(element.getElementsByTagName("Mark").item(0).getTextContent());
		   }
		   System.out.println("-----------------------");
	   }
	   
	}
}
