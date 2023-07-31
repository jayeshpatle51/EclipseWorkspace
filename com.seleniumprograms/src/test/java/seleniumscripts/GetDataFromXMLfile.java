package seleniumscripts;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import utilities.XmlDataReader;

public class GetDataFromXMLfile {

	@Test
	public static void getData() throws ParserConfigurationException, SAXException, IOException {

		String filepath = "C:\\Users\\SPURGE\\Documents\\marks.xml";
		// OutputStream output = new FileOutputStream(new File(filepath));
		List<Element> list = XmlDataReader.xmlReader(filepath);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getAttribute("rln") + " "
					+ list.get(i).getElementsByTagName("lastname").item(0).getTextContent());
		}

		// list.get(0).getElementsByTagName("firstname").item(0).setTextContent("ramesh");
	}

}
