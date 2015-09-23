package com.metacampus.vehiclemanagement.xml;
/**
 * Name: WriteConnectionMain
 * @author Anurag
 * Since: 22 September,2015
 * Description: writes into the file
 **/
public class WriteConnectionMain
{
	/**
	 * Name: main
	 * @param args
	 * Description: User interface
	 */
	public static void main(String[] args)
	{
		WriteConnectionXML connectionFile = new WriteConnectionXML();
		connectionFile.setFile("Connection.xml");
		try
		{
			connectionFile.saveConfig();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
