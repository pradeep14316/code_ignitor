package iopackage;

import java.io.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class JsonExtract {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			File xml = new File("/home/pradeep/Downloads/ebay.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(xml);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("listing");
		} catch (Exception e) {System.out.println(e);
		}

	}
}
