package by.htp3.les03.arrays;

import java.util.Random;
import java.util.Scanner;

	public class  SortIndexZero{
	
		public static void main (String arg []){

			@SuppressWarnings("resource")
			Scanner sc= new Scanner (System.in);
            System.out.println("Input ArraySize:");
            int arraySize = sc.nextInt();			//���� � ���������� ����������� ���������� �������
            	
            int[] mas = new int[arraySize]; 
            
            Random rand = new Random();
            
            	for (int i = 0; i<mas.length;i++){  //���� ����� ������� ��������� �����
            		
            		mas[i]=rand.nextInt(5);
            		System.out.print(mas[i]+"; ");
            	}
            	
            findZeroIndex(mas);
		}

    public static void findZeroIndex(int mas[]){ 				// �-� ���������� ������� ��������� � ������� ������� � ���������

        if (mas.length == 0){                                   //�������� ������� �� ������� ��������
            System.out.println("Error. The array is empty!");
        }

        int count = 0;

        for (int i = 0; i<mas.length;i++){						//���� ��� ���������� ������� ������� ��� ������� ��������
            if (mas[i]==0){
                count++;
            }
        }
            
       System.out.println("");
       System.out.println("Array 2:");
       
       int [] masIndexZero = new int[count];    
       int count2 = 0;
       
        for (int j = 0; j<mas.length;j++){
       
    	   if (mas[j]==0){
              	masIndexZero[count2]=j;
                System.out.println("["+count2+"]=>"+masIndexZero[count2]);
                count2++;
           }
       }
     }
    }

