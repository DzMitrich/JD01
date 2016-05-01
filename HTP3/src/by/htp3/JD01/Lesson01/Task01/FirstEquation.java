package by.htp3.JD01.Lesson01.Task01;

import java.io.IOException;
import java.util.Scanner;

public class FirstEquation {

	public static void main(String[] args) throws IOException {

	double x;
	double result;
	x = inputX();
	result = calculationValue(x);
	print(result,x);
	

	}

	private static double inputX() throws java.io.IOException {
	
		double x=0;
		System.out.print("Enter value of x :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	
		if(sc.hasNextDouble()){
			x = sc.nextDouble();
		}	
		return x;
		
		
	}
		private static double calculationValue(double x) {

			double temp = x - (Math.pow(x,3)/3) + (Math.pow(x,5)/5);
			
		return temp;
	}

		private static void print(double result, double x) {
			
			System.out.println("Result Equation with value x = " + x + ": x-(x^3)/3+(x^5)/5 = "+result);
			
		}

}

