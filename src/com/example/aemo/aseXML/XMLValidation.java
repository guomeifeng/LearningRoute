package com.example.aemo.aseXML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLValidation {
	static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

	public static void main(String argv[]) {

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//			dbFactory.setSchema();
//			dbFactory.setNamespaceAware(true);
//			boolean xsdValidate = true;
//			boolean dtdValidate = false;
//			dbFactory.setValidating(dtdValidate || xsdValidate);
//			if (xsdValidate) {
//				
//			}
			
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			File xmlFile = new File("aseXML.xml");
			xmlFile.createNewFile();
			Document doc = dBuilder.newDocument();

//            Node newChild = new Node("aaa");
			Node node = doc.createElement("aaa");
			node.setNodeValue("BBB");
			doc.appendChild(node);
			doc.setXmlVersion("1.0");
			doc.setXmlStandalone(false);
//			doc.setPrefix("ase");
			doc.setDocumentURI("www.w3c.doc");
			doc.normalizeDocument();
//			doc.getDocumentElement().normalize();
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			Result output = new StreamResult(new File("output.xml"));
//			Source input = new DOMSource(myDocument);

//			transformer.transform(input, output);

//			System.out.println("City: " + doc.getDocumentElement().getChildNodes().item(0).getFirstChild()
//					.getChildNodes().item(0).getAttributes().getNamedItem("data").getNodeValue());
//
//			System.out.println("Postal Code: " + doc.getDocumentElement().getChildNodes().item(0).getFirstChild()
//					.getChildNodes().item(1).getAttributes().getNamedItem("data").getNodeValue());
//
//			System.out.println("Date: " + doc.getDocumentElement().getChildNodes().item(0).getFirstChild()
//					.getChildNodes().item(4).getAttributes().getNamedItem("data").getNodeValue());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
