import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Name: ServiceStation
 * @author anurag
 * Since: 13August,2015
 * Description: This function returns the required output 
 **/

public class ServiceStation extends Persons
{  
    /**
     * Name: main 
     * @param args
     * Description:prints the output after calling the functions
     */
	public static void main(String args[])
	{
		int suv = 0, hatchback = 0, sedan = 0;
		HashMap<String, String> output = new HashMap<String, String>();
		output = Call();
		for (Map.Entry<String, String> m : output.entrySet())
		{
			// System.out.println(m.getKey()+" "+m.getValue());
			if (m.getValue().equalsIgnoreCase("SUV")) // check for number of cars
			{
				suv++;
			} 
			else if (m.getValue().equalsIgnoreCase("Sedan")) //check for number of sedan
			{
				sedan++;
			} 
			else if (m.getValue().equalsIgnoreCase("hatchback"))//check for no of hatchback
			{
				hatchback++;
			}
		}
		System.out.println("Total number of car Serviced");// printing of output
		System.out.println("SUV=" + suv);
		System.out.println("Sedan=" + sedan);
		System.out.println("hatchback=" + hatchback);
		long totalEarning = suv * 5000 + sedan * 3000 + hatchback * 2000;
		System.out.println("Total Earning=" + totalEarning);

	}
    /**
     * Name:Call
     * @return hashmap
     * Description: This calls the person and car class and performs operation 
     */
	public static HashMap<String, String> Call()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		List<String> mechanic1 = new ArrayList();
		List<String> car1 = new ArrayList();
		String COMMA_DELIMITER = " ";// separation based on this
		ServiceStation obj = new ServiceStation();
		try
		{
			mechanic = ServiceStation.readCsvFilePersons();
			car1 = Car.readCsvFile();
			String[] registrationnumber = new String[car1.size()];
			String[] cartype = new String[car1.size()];
			String[] name = new String[mechanic.size()];
			String[] carTypeService = new String[mechanic.size()];
			String[] rate = new String[mechanic.size()];

			for (int i = 0; i < car1.size(); i++) 
			{
				String[] tokens = car1.get(i).split(COMMA_DELIMITER);// intializing the value to the string array
				if (tokens.length > 0) {
					registrationnumber[i] = tokens[0];
					cartype[i] = tokens[1];
				}
			}
			for (int i = 0; i < mechanic.size(); i++) 
			{
				String[] tokens = mechanic.get(i).split(COMMA_DELIMITER);// intializing the value to the string array
				if (tokens.length > 0) {
					name[i] = tokens[0];
					carTypeService[i] = tokens[2];
					rate[i] = tokens[3];

				}
			}

			int count = 0;
			for (int loopCount = 0; loopCount < car.size(); loopCount++) //alloting cars to the mechanic
			{
				for (int loopmechanic = 0; loopmechanic < mechanic.size(); loopmechanic++)
				{

					if (cartype[loopCount].equalsIgnoreCase(carTypeService[loopmechanic])&& (count <= car.size()))
					{
						hm.put(name[loopmechanic], cartype[loopCount]);
						carTypeService[loopmechanic] = " ";
						count++;
						break;
					}
				}
			}

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hm;
	}
}
