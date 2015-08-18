package session4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Name: TowerOfHanoi
 * @author Anurag 
 * Since: 11 August,2015 Description: Arranges the peg in ascending order
 **/
public class TowerOfHanoi 
{
	int noOfDisk;
	List<String> diskMovementList;
	/**
	 * Name: main function
	 * @param args
	 **/
	public static void main(String[] args) throws IOException 
	{
		int noOfDisk = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Tower of Hanoi problem");
		System.out.println("Enter no of disc\t");//input 
		noOfDisk = Integer.parseInt(input.readLine());
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi(noOfDisk);
		List<String> diskMovementList = towerOfHanoi.towerOfHanoi("A", "B","C", noOfDisk);
		for (int index = 0; index < diskMovementList.size(); index++)
			System.out.println(diskMovementList.get(index));
	}

	public TowerOfHanoi(int noOfdisks) 
	{
		this.noOfDisk = noOfdisks;
		diskMovementList = new ArrayList<String>();
	}

	/**
	 * @param noOfDisk
	 * @param source
	 * @param intermediate
	 * @param destination
	 * Description: performs the movement of the peg
	 **/
	List<String> towerOfHanoi(String source, String destination,String intermediate, int noOfDisk) 
	{
		int disks = this.noOfDisk - noOfDisk + 1;
		if (noOfDisk == 1) 
		{
			String content = "Move Disk " + disks + " from " + source + " to "+ destination;
			diskMovementList.add(content);
		} 
		else 
		{
			towerOfHanoi(source, intermediate, destination, noOfDisk - 1);
			String content = "Move Disk " + disks + " from " + source + " to "+ destination;
			diskMovementList.add(content);
			towerOfHanoi(intermediate, destination, source, noOfDisk - 1);//recursion call

		}
		return diskMovementList;
	}

}
