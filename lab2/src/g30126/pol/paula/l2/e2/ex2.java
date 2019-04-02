package g30126.pol.paula.l2.e2;

import java.util.Scanner;

public class ex2 {
	public static void f1(int x)
	{
	if(x==1) System.out.println("ONE");
	else if(x==2) System.out.println("TWO");
	else if(x==3) System.out.println("THREE");
	else if(x==4) System.out.println("FOUR");
	else if(x==5) System.out.println("FIVE");
	else if(x==6) System.out.println("SIX");
	else if(x==7) System.out.println("SEVEN");
	else if(x==8) System.out.println("EIGHT");
	else if(x==9) System.out.println("NINE");
	else System.out.println("OTHER");
	}
	public static void f2 (int x)
	{
		switch (x) {
		case 1: System.out.println("ONE");
		  break;
		case 2: System.out.println("TWO");
		  break;  
		case 3: System.out.println("THREE");
		  break;  
		case 4: System.out.println("FOUR");
		  break;
		case 5: System.out.println("FIVE");
		  break;
		case 6: System.out.println("SIX");
		  break;
		case 7: System.out.println("SEVEN");
		  break;
		case 8: System.out.println("EIGHT");
		  break;
		case 9: System.out.println("NINE");
		  break;
		default:System.out.println("OTHER");
		  break;
	}
}
	public static void main(String[]args) {
		System.out.println("introduceti un numar");
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		f1(x);
		f2(x);
	}
	}