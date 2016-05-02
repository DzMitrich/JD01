package by.htp3.JD01.Lesson05.Fraction;

import java.util.Arrays;
import java.util.Collection;

public class Start {

	public static void main(String[] args) {
		SimpleFraction f1 = new SimpleFraction(-19, 21);
		SimpleFraction f2 = new SimpleFraction(11, 15);
		
		
		System.out.println("Fraction example F1:");
		Print.print(f1);
		System.out.println("Fraction example F2:");
		Print.print(f2);
		System.out.println("example F1 + F2:");
		SimpleFraction f3 = f1.add(f2);
		Print.print(f3);
		System.out.println("example F1 - F2:");
		SimpleFraction f4 = f1.subtract(f2);
		Print.print(f4);
		System.out.println("example F1 * F2:");
		SimpleFraction f5 = f1.multiply(f2);
		Print.print(f5);
		System.out.println("example F1 / F2:");
		SimpleFraction f6 = f1.divide(f2);
		Print.print(f6);
		
		SimpleFraction [] srr = new SimpleFraction[] {f1, f2, f3, f4, f5, f6};
		Print.print(srr);
		
		Collection<SimpleFraction> coll = Arrays.asList(srr);
		Print.print(coll);
	}

}