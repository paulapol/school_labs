package g30126.pol.paula.l2.e1;

import java.util.Scanner;

public class ex1 {
	
		 public static void main(String[] args){
			 System.out.println("introduceti numerele ");
			 Scanner in = new Scanner(System.in);
		     int x = in.nextInt();
		     int y = in.nextInt();
		     if(x>y)
		    	  System.out.println("maximul dintre "+x+" si "+y+" este: "+x);
		      else 
		    	  System.out.println("maximul dintre "+x+" si "+y+" este: "+y);
              in.close();
		 } 
		}