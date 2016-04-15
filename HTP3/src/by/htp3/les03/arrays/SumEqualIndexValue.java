package by.htp3.les03.arrays;

import java.util.Random;
import java.util.Scanner;

public class SumEqualIndexValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the sequence: ");
		int arraySize = sc.nextInt();
		sc.close();
		
		int [] mas = new int[arraySize];
		Random rand = new Random();
		
		System.out.println("Random sequence:");
		System.out.print("{ ");
			for (int i=0;i<mas.length;i++){
				mas[i]=rand.nextInt(arraySize);
				System.out.print("["+i+"]="+mas[i]+"; ");
			}
			System.out.print("}");
			System.out.println("");
		
			findSummIndexAndValue(mas);
		
	}
	
	private static void findSummIndexAndValue(int mas[]) {
		
		int sum = 0;
		int couth = 0;
		System.out.println("");
		System.out.println("This condition corresponds next elements:");	
		for (int i=0;i<mas.length;i++){
			
			if (mas[i]==i) {
				sum = sum + mas[i];
				couth++;
				System.out.println("["+i+"]=>"+mas[i]+";");
			}
		}
		System.out.println("Total number from "+couth+" elements = "+sum);
	}
}
