package com.metacampus.vehiclemanagement.xml;

import java.io.FileOutputStream;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
/**
 * Name: WriteConnectionXml
 * @author Anurag
 * Since: 21 September,2015
 * Description: Writes the data to database using xml
 **/
public class WriteConnectionXML
{
	// to store the addres of connection file
	private String connectionFile;
	/**
	 * Name: setFile
	 * @param connectionFile
	 * Description: 
	 **/
	public void setFile(String connectionFile)
	{
		this.connectionFile = connectionFile;
	}
	/**
	 * Name: saveConfig
	 * @throws Exception
	 * Description: stores the configuration
	 **/
	public void saveConfig() throws Exception 
	{
		// create an XMLOutputFactory
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(connectionFile));
		// create an EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		// create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);

		// create config open tag
		StartElement configStartElement = eventFactory.createStartElement("","", "connection");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		// Write the different nodes
		createNode(eventWriter, "url","jdbc:mysql://localhost:3306/vehicle_management");
		createNode(eventWriter, "driver", "com.mysql.jdbc.Driver");
		createNode(eventWriter, "username", "root");
		createNode(eventWriter, "password", "mysql");
		eventWriter.add(eventFactory.createEndElement("", "", "connection"));
		eventWriter.add(end);
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	/**
	 * Name: createNode
	 * @param eventWriter
	 * @param name
	 * @param value
	 * @throws XMLStreamException
	 * Description:Creates the node of xml
	 **/
	private void createNode(XMLEventWriter eventWriter, String name,String value) throws XMLStreamException 
	{
		// eventFactory event is  called
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
