package by.htp3.les03.arrays;


import java.util.Scanner;

public class CompressArray { //Task(arrays) Les03_4 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);					// Input from keyboard [N] for original array
		System.out.println ("Enter the value [N] of array:");
		int indexMas = sc.nextInt();
		

		System.out.println("Input elemets oa array:");					
		System.out.print("{");
		
		int [] mas = new int [indexMas];
		
			for (int i=0;i<mas.length;i++){								//Input numbers in array
			System.out.print("Enter element [:"+i+"]=>");
			mas[i]=sc.nextInt();
			
			}
		sc.close();
			
		System.out.println("Origin array:");
		System.out.print("{");
		
		for (int k=0;k<mas.length;k++){									// Print the original array
		System.out.print(" "+mas[k]+";");
	
		}
		System.out.print("}");
		
		int couth=0;
		for(int j=0;j<mas.length-1-couth;j++){
			
		if (mas[j]==0){
			for(int m=j;m<mas.length-1;m++){
			
				mas[m]= mas[m+1];
				
			}
		mas[mas.length-couth-1]=0;
		couth++;
		}
		}
				
			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			for (int s=0;s<mas.length;s++){							
				System.out.print(mas[s]+"; ");						//Print compress the array
				}
			System.out.print("}");
	
	}
}

