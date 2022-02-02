import java.util.Scanner;
public class housePainting {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
		//Input dimensions
		
		System.out.println("Please enter the cost per square foot:");
		double sqftCost = scan.nextDouble();
	
		System.out.println("Please enter the length of the house:");
		double houseLength = scan.nextDouble();
		
		System.out.println("Please enter the width of the house:");
		double houseWidth = scan.nextDouble();
		
		System.out.println("Please enter the height of the house:");
		double houseHeight = scan.nextDouble();
		
		System.out.println("Please enter the amount of windows:");
		double windowNum = scan.nextDouble();
		
		System.out.println("Please enter the length of the window:");
		double windowLength = scan.nextDouble();
		
		System.out.println("Please enter the width of the window:");
		double windowWidth = scan.nextDouble();
		
		System.out.println("Please enter the amount of doors:");
		double doorNum = scan.nextDouble();
		
		System.out.println("Please enter the length of the door:");
		double doorLength = scan.nextDouble();
		
		System.out.println("Please enter the width of the door:");		
		double doorWidth = scan.nextDouble();
		
		
		//Calculations 
		
		double windowTotal = windowLength * windowWidth * windowNum;
		 
		double doorTotal = doorLength * doorWidth * doorNum;
		
		double houseTotal = 1/2 + (houseLength * (houseHeight-houseWidth))+ 2 * (houseLength * houseWidth)+(houseLength * houseWidth) * 2;
		
		double sqFt = (houseTotal-(windowTotal+doorTotal));
		System.out.println("Your total paintable surface area is " + sqFt + " square feet");
		
		double estimate = sqftCost * sqFt;
		System.out.println("Your estimate is " + estimate + " dollars");
		
	

	}

}