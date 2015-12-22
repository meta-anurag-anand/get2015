package LoggingException;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Demoemployee {
	
	private static Logger logger = Logger.getLogger(Demoemployee.class);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		employee employee[] = new employee[2];
		
			for(int i = 0; i < 3; i++){
				employee[i] = new employee();
				System.out.println("Enter employee "+(i+1)+" id");
				
			    try {
					employee[i].setId(scanner.nextInt());
				} catch (Exception e) {
					logger.error("You are having exception... :(", e);
				}
			    System.out.println("Enter employee "+(i+1)+" name");
			    try {
					employee[i].setName(scanner.next());
				} catch (Exception e) {
					logger.error("You are having exception... :(", e);
				}
			    System.out.println("Enter employee "+(i+1)+" address");
			    try {
					employee[i].setAddress(scanner.next());
				} catch (Exception e) {
					logger.error("You are having exception... :(", e);
				}
			    System.out.println("Enter employee "+(i+1)+" salary");
			    try {
					employee[i].setSalary(scanner.nextInt());
				} catch (Exception e) {
					logger.error("You are having exception... :(", e);
				}
			}

		
		for(int i = 0; i < 2; i++){
			System.out.println("employee "+ i+ " information: "+employee[i]);
		}
		
	}

}
