import java.util.ArrayList;
import java.util.Scanner;

// Work in Progress


public class PolynomialApplicationTwo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the highest degree and then each coefficient from highest to lowest degree: ");
		String input = keyboard.nextLine(); //3 5 0 2 -3 <------- test value
		
		//Convert the String into an array list of Integers
		 String[] polyArray = input.split(" ");
		 ArrayList<Integer> polyList = new ArrayList<>();
		 for(int i = 0; i < polyArray.length; i++) {			 
			 polyList.add(Integer.parseInt(polyArray[i]));
		 }

		//Create the polynomial from the arrayList
		int degree = polyList.get(0);
		Polynomial myPoly = new Polynomial(degree+1); // degree + 1
		
		for(int i = 0; i < polyList.size(); i++){
			myPoly.setCoefficient(i, polyList.get(i));
		}

		String reply = "";
		do {
			//Test bounds 0 to 1
			System.out.println("Enter the lower bounds:");
			double lower = keyboard.nextDouble();
			
			System.out.println("Enter the upper bounds:");
			double upper = keyboard.nextDouble();
			
			double area = myPoly.integrate(lower, upper);
			
			System.out.println("The aproximatate area = " + area);
			
			System.out.println("Continue? Enter Yes or No");
			 reply = keyboard.next();
			
		}while (reply.equals("Yes"));
		
	}

}
