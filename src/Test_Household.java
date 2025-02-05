import java.util.*;
public class Test_Household {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		//For default constructor
		
		Household house1 = new Household();
		System.out.println("Total Occupants: "+ house1.getOccupants());
		System.out.println("Total Income: "+ house1.getIncome());
		
		System.out.println();
		
		
		//For 1 arg constructor
		
		Household house2 = new Household(10);
		System.out.println("Total Occupants: "+ house2.getOccupants());
		System.out.println("Total Income: "+ house2.getIncome());
		
		System.out.println();
		
		
		//For 2 arg constructor
		
		Household house3 = new Household(5, 3500000);
		System.out.println("Total Occupants: "+ house3.getOccupants());
		System.out.println("Total Income: "+ house3.getIncome());
		
		System.out.println();
		
		
		//setter, getter		
		Household house4 = new Household();
		System.out.println("How many occupants are there?");
		int occu = scan.nextInt();
		house4.setOccupants(occu);
		
		System.out.println("How much income is there?");
		float inc = scan.nextFloat();
		house4.setIncome(inc);
		
		System.out.println("Total Occupants: "+ house4.getOccupants());
		System.out.println("Total Income: "+ house4.getIncome());
	
		
	}
	
}
