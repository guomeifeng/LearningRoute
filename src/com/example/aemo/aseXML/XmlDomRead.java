package com.example.aemo.aseXML;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDomRead {

    public static void main(String argv[]) throws SAXException,
            IOException, ParserConfigurationException {
    	validateXmlFile();
    	
    	validateXmlFile2();
        File xmlFile = new File("NEMMSATS_ChangeRequest_r38.xml");
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);

        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("ase:aseXML");

        for (int i = 0; i < nList.getLength(); i++) {

            Node nNode = nList.item(i);

            System.out.println("\nCurrent Element: " + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            	
                Element elem = (Element) nNode;
                
                Node node1 = elem.getElementsByTagName("Header").item(0);
                NodeList headerNodes = node1.getChildNodes();		
                for (int j = 0; j < headerNodes.getLength(); j++) {
                	System.out.println(headerNodes.item(j).getNodeName()+":" +headerNodes.item(j).getTextContent());;
                }
                
                
                NodeList nList2 = doc.getElementsByTagName("Transaction");
                
                for (int j = 0; j < nList2.getLength(); j++) {
                	Node nNode2 = nList2.item(j);
                	Element element = (Element) nNode2;

                	String uid = element.getAttribute("transactionID");

                    Node nodeChangeReasonCode = element.getElementsByTagName("ChangeReasonCode").item(0);
                    String fname = nodeChangeReasonCode.getTextContent();

                    Node nodeProposedDate = element.getElementsByTagName("ProposedDate").item(0);
                    String lname = nodeProposedDate.getTextContent();

                    Node node3 = element.getElementsByTagName("NMI").item(0);
                    String occup = node3.getTextContent();

                    System.out.printf("User id: %s%n", uid);
                    System.out.printf("First name: %s%n", fname);
                    System.out.printf("Last name: %s%n", lname);
                    System.out.printf("Occupation: %s%n", occup);
                }
                

                
            }
        }
    }
    
    private static void validateXmlFile() {
    	
        try {
        	
        	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        	factory.setNamespaceAware(true);
        	File xmlFile = new File("NEMMSATS_ChangeRequest_r38.xml");
            DocumentBuilder dBuilder = factory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            File xsdFile = new File("C:\\Kelly Guo\\Project files\\aseXML_r38.xsd");
            Schema schema = schemaFactory.newSchema(xsdFile);
            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(doc));
        }catch(Exception ex) {
        	ex.printStackTrace();
        }
        
    	
    }
    
    
   private static void validateXmlFile2() {
    	
        
        
    	
    	
//    	URL schemaFile = new URL("aseXML_r38.xsd");
    	Source schemaFile = new StreamSource(new File("C:\\Kelly Guo\\Project files\\aseXML_r38.xsd"));
    	// webapp example xsd: 
    	// URL schemaFile = new URL("http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");
    	// local file example:
    	// File schemaFile = new File("/location/to/localfile.xsd"); // etc.
    	Source xmlFile = new StreamSource(new File("NEMMSATS_ChangeRequest_r38.xml"));
    	SchemaFactory schemaFactory = SchemaFactory
    	    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    	try {
    	  Schema schema = schemaFactory.newSchema(schemaFile);
    	  Validator validator = schema.newValidator();
    	  validator.validate(xmlFile);
    	  System.out.println(xmlFile.getSystemId() + " is valid");
    	} catch (SAXException e) {
    	  System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
    	} catch (IOException e) {}
    }
}