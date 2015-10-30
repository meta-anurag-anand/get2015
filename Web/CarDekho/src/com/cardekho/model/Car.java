package com.cardekho.model;
/**
 * Name: Car
 * @author Anurag
 * Since: 26 October,2015
 * Description: CAr Details
 **/
public class Car extends Vehicle {

	//To Store Vehicle Id
	private int vehicleId;
	// To store Ac
	private String AC;
	// To store PowerStering
	private String powerSteering;
	// To store accessory kit
	private String accessoryKit;
	// Gets The Vehicle Id
	public int getVehicleId() 
	{
		return vehicleId;
	}
	// Sets the Vehicle Id
	public void setVehicleId(int vehicleId) 
	{
		this.vehicleId = vehicleId;
	}
	// Gets the Ac
	public String getAC()
	{
		return AC;
	}
	// Sets the Ac
	public void setAC(String aC)
	{
		AC = aC;
	}

	/** Method to find whether powerSteering is available in car or not
	 * 
	 * @return powerSteering: true if powerSteering exist, false otherwise
	 */
	public String getPowerSteering() {
		return powerSteering;
	}

	/** MEthod to set powerSteering availability of a car
	 * 
	 * @param powerSteering : true if powerSteering available, false otherwise
	 */
	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}

	/** Method to find whether accessoryKit is available in car or not
	 * 
	 * @return powerSteering: true if accessoryKit exist, false otherwise
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}

	/** MEthod to set accessoryKit availability of a car
	 * 
	 * @param accessoryKit : true if accessoryKit available, false otherwise
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
	/** Method to get string representation of details of a car 
	 * Internally this method calls toString() of Vehicle class to print basic details 
	 * related to vehicle
	 */
	@Override
	public String toString() {
	
		return super.toString()+",AC: "+
		this.AC+",Power Steering: "+this.powerSteering+",Accessory Kit: "+this.accessoryKit;
		
	}
}