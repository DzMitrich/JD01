package by.htp3.les03.arrays;

import java.util.Random;
import java.util.Scanner;

public class QuantityOfOddElements {

	public static void main(String[] args) {
												
		Scanner sc = new Scanner(System.in);
		System.out.println("Input [N] of sequence elements:");		// Input [N] of sequence elements:
		int indexMas = sc.nextInt();
	
		System.out.println("Original array:");						
		System.out.print("{");
	
		Random rand = new Random ();								//Input random numbers in array
		int [] mas = new int [indexMas];
		int oddElem = 0;
		float percent = 0;
		
		for (int i=0;i<mas.length;i++){								// Print the original array
		mas[i]=rand.nextInt(10);
		System.out.print(" "+mas[i]+";");
		if(mas[i]/2==0){
			oddElem++;
		}
		
		sc.close();
		percent = ((float)oddElem*100/(float)indexMas);				//Calculation of the number of odd elements
		}
		System.out.print("}");
		System.out.println("");
		System.out.print("The sequence of the elements ("+indexMas+") contains the odd elements ("+oddElem+"): ");
		System.out.printf("%.2f",percent);							// Format output
		System.out.print(" %");

	}
}

	



