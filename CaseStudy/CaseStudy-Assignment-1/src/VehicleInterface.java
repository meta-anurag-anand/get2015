import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehicleDetailPrinter;

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
		
		// Initialization 
		Car carObj = VehicleHelper.createObject("Maruti", "Desire", "1500 CC", "100 Liters", "25 km/pl", 2, 5);
		System.out.println( VehicleDetailPrinter.printVehicleDetails(carObj));
		
		Bike bikeObj = VehicleHelper.createObject("Bajaj", "Avenger", "200 CC", "20 Liters", "35 km/pl", 5, "Stepped");
		System.out.println( VehicleDetailPrinter.printVehicleDetails(bikeObj));

	}

}
