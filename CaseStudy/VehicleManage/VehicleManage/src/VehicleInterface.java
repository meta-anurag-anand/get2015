import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.metacampus.vehiclemanagement.helper.VehicleJDBCHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.xml.ConnectionItems;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;
import com.metacampus.vehiclemanagement.xml.ReadVehicleData;
import com.metacampus.vehiclemanagement.xml.WriteConnectionXML;

/**
 * Name: vehicleInterface
 * @author anurag
 * Since: 14 September 2015
 * Description: Interface of the vehicle
 */
public class VehicleInterface
{
	/**
	 * Name: main
	 * @param args
	 * Description: user Interface
	 **/
	public static void main(String[] args) 
	{
		
		try
		{
			// Opening Connection file  
			WriteConnectionXML connectionFile = new WriteConnectionXML();
		    connectionFile.setFile("Connection.xml");
		    connectionFile.saveConfig();
		    // Reading Connection Xml
		    ReadConnectionXml readConnection = new ReadConnectionXml();
		    ConnectionItems connectionItems =  readConnection.readConfig("connection.xml");
		    // Reading the Data
			ReadVehicleData readVehicleData = new ReadVehicleData();
			// List Contaning Vehicle list
		    List<Vehicle> vehicleList = readVehicleData.readData("VehicleData.xml");
		    Iterator<Vehicle> vehicleListIterator = vehicleList.iterator();
		    while(vehicleListIterator.hasNext())
		    {
		    	VehicleJDBCHelper.createConnection(vehicleListIterator.next());
		    }
		    // Searching the Value by make and model
		    List<Vehicle> searchResultList = new ArrayList<Vehicle>();
		    searchResultList =VehicleJDBCHelper.searchByMakeAndModel("Hyundai", "Verna");
		    if(searchResultList == null || searchResultList.size() == 0)
		    {
		    	System.out.println("No Data Available");
		    	return;
		    }
		    Iterator<Vehicle> searchResultIterator = searchResultList.iterator();
		    while(searchResultIterator.hasNext()) 
		    {
		    	
		    	Vehicle vehicle = searchResultIterator.next();
		    	// hecking for the instance of car
		    	if(vehicle instanceof Car)
		    	{
		    		System.out.println("Make: "+vehicle.getMake());
		    		System.out.println("Model: "+vehicle.getModel());
		    		System.out.println("Engine CC: "+vehicle.getEngineCC());
		    		System.out.println("Fuel Capacity: "+vehicle.getFuelCapacity());
		    		System.out.println("Mileage: "+vehicle.getMileage());
		    		System.out.println("Price: "+vehicle.getPrice());
		    		System.out.println("Road Tax: "+vehicle.getRoadTax());
		    		System.out.println("AC: "+((Car)vehicle).getAC());
		    		System.out.println("Power Steering: "+((Car)vehicle).getPowerSteering());
		    		System.out.println("Accessory Kit: "+((Car)vehicle).getAccessoryKit());
		    	}
		    	// If not present in car then in bike
		    	else if(vehicle instanceof Bike)
		    	{
		    		System.out.println("Make: "+vehicle.getMake());
		    		System.out.println("Model: "+vehicle.getModel());
		    		System.out.println("Engine CC: "+vehicle.getEngineCC());
		    		System.out.println("Fuel Capacity: "+vehicle.getFuelCapacity());
		    		System.out.println("Mileage: "+vehicle.getMileage());
		    		System.out.println("Price: "+vehicle.getPrice());
		    		System.out.println("Road Tax: "+vehicle.getRoadTax());
		    		System.out.println("Self Start: "+((Bike)vehicle).getSelfStart());
		    		System.out.println("Helmet Price: "+((Bike)vehicle).getHelmetPrice());
		    	}
		    }
		    
		    // Checking how many rows updated
		    int numberOfRowsUpdated;
		    numberOfRowsUpdated = VehicleJDBCHelper.updateByMake("Hyundai");
		    if(numberOfRowsUpdated == -1) 
		    {
		    	System.out.println("No Record Found");
		    } 
		    else
		    {
		    	System.out.println("Number of records Updated are :"+ numberOfRowsUpdated);
		    }
		    // Deleting rows
		    int numberOfRowsDeleted;
		    numberOfRowsDeleted = VehicleJDBCHelper.deleteByMake("Hyundai");
		    if(numberOfRowsDeleted == -1) 
		    {
		    	System.out.println("No Record Found");
		    } 
		    else
		    {
		    	System.out.println("Number of records deleted are :"+ numberOfRowsDeleted);
		    }
		} 
		catch(Exception e)
		{
		    System.out.println(e.getMessage());
		}
	}

}