import java.util.Scanner;

public class PolynomialTestDriver {

	public static void main(String[] args) {
			
		Scanner keyboard = new Scanner(System.in);
		
		Polynomial myPoly = new Polynomial(3);
		myPoly.setCoefficient(3, 5);
		myPoly.setCoefficient(1, 2);
		myPoly.setCoefficient(0, -3);
		
		System.out.println(myPoly.evaluate(0.0));
		System.out.println(myPoly.evaluate(1.0));
		System.out.println(myPoly.evaluate(0.5));
		
		
	}

}
