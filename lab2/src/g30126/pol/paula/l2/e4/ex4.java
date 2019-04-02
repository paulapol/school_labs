package g30126.pol.paula.l2.e4;

import java.util.Random;
import java.util.Scanner;
public class ex4 {
	public static void main(String[] args){
	
	        Random r = new Random();
	        Scanner in = new Scanner(System.in);
	        System.out.println("introduceti nr de elemente");
	        int N=in.nextInt();
	        for(int i=0;i<N;i++){
	        	System.out.println("numar generat:" +r.nextInt(30));
	   
		}
	}

}
