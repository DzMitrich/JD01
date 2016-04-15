package by.htp3.les03.arrays;

import java.util.Random;
import java.util.Scanner;

public class ReversArray { //Task(arrays) Les03_6 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);					// Input from keyboard [N] for original array
		System.out.println ("Enter the value [N] of array:");
		int indexArray = sc.nextInt();
		sc.close();

		System.out.println("Original array:");					// Print the original array
		System.out.print("{");
		
		Random rand = new Random ();
		int [] mas = new int [indexArray];
		
			for (int i=0;i<mas.length;i++){						//Input random numbers in array
			mas[i]=rand.nextInt(indexArray);
			System.out.print(mas[i]+"; ");
			}
		System.out.print("}");
		System.out.println("");
		System.out.println("Revers array:");
		System.out.print("{");
		
			for(int j=0;j<mas.length/2;j++){					//Reverse the array
				int temp = mas[j];
				mas[j] = mas[mas.length-1-j];
				mas[mas.length-1-j]=temp;
			}
		
			for (int i=0;i<mas.length;i++){						//Print reverse the array
				System.out.print(mas[i]+"; ");
				}
			System.out.print("}");
	}

}
