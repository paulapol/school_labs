package g30126.pol.paula.l2.e5;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
	}
   
	public static void main(String[] args)
	{
		Random r = new Random();
        Scanner in = new Scanner(System.in);
        int[] v;
        v = new int[10];
        for(int i=0;i<10;i++){
        	v[i]=r.nextInt(30);
        }
        bubbleSort(v);
        for(int i=0;i<10;i++){
      	  System.out.println(+v[i]+" ");
        }
	}
}
