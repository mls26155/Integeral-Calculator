
public class Polynomial {

	int degree;
	int[] coefficients;
	
	public Polynomial(int degree){
		this.degree = degree;
		coefficients = new int[degree+1];
	}
	
	public void setCoefficient(int degree, int coefficient) {
		coefficients[degree] = coefficient;
	}
	
	public double evaluate(double x) {
		double result = 0;
		for(int i = 0; i < coefficients.length; i++){				
				result += coefficients[i] * Math.pow(x, i);
		}
		return result;
	}
	
	public double evaluateV2(double x) {
		double result = 0;
		int deg = degree;
		for(int i = 0; i < coefficients.length; i++){				
				result += coefficients[i] * Math.pow(x, deg);
        deg--;
		}
		return result;
	}
	
	
	public double integrate(double lower, double upper) {
		
		double area = 0;
		double width = (upper - lower) / 1000;
		double x = lower;
		
		for(int i = 0; i < 1000; i++) {
			area += (width * evaluateV2(x)); //width x height
			x += width;	
		}
		
		return area;
		
	}
	
}
