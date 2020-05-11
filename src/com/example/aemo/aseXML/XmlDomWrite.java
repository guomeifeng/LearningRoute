package com.example.aemo.aseXML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDomWrite {
	public static void main(String argv[]) throws SAXException, IOException, ParserConfigurationException {

		

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = factory.newDocumentBuilder();
		
		Document doc = dBuilder.newDocument();
		
		doc.setXmlVersion("1.0");
		Node root = doc.createElement("ase:aseXML");
		Node header = doc.createElement("Header");
		Node from = doc.createElement("From");
		from.setTextContent("NEMMCO");
		Attr att = doc.createAttribute("description");
		att.setValue("National Electricity Market Management Company");
		Element eleFrom = (Element)from;
		eleFrom.setAttributeNode(att);
		header.appendChild(from);
		root.appendChild(header);
		doc.appendChild(root);
		
//		node.setTextContent("bb");
//		doc.appendChild(node);
//		doc.createElementNS("http://www.w3.org/2001/XMLSchema-instance","xmlns:xsi");
//		doc.createElementNS("urn:aseXML:r38", "xmlns:ase");
	

		
		File xmlFile = new File("aseXML.xml");
		Transformer transformer = null;
		try {
			transformer = TransformerFactory.newInstance().newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			transformer.transform(new DOMSource(doc), new StreamResult(xmlFile));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//
//		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

//		NodeList nList = doc.getElementsByTagName("ase:aseXML");
////		Document doc = dBuilder.parse(xmlFile);
////		File xmlFile = new File("NEMMSATS_ChangeRequest_r38.xml");
	}
	
	
	
	
}
