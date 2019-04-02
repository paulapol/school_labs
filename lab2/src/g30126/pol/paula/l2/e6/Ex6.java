package g30126.pol.paula.l2.e6;

import java.util.Scanner;

public class Ex6 {

	static void m1(int x)
	{
		int p=1;
		if(x==1||x==0)
		 p=1;
	else {
		int i;
		for(i=2;i<=x;i++)
		{p=i*p;}
		}
		System.out.println("metoda nerecursiva: "+x+"!="+p);
	}
	static int m2(int x)
	{
		if(x==1||x==0) return 1;
		else return x*m2(x-1);
			
	}
	public static void main(String[] args) {

		  System.out.println("introduceti un numar");
		  Scanner in = new Scanner(System.in);
			int x=in.nextInt();
			m1(x);
			int p=m2(x);
			System.out.println("metoda recursiva: "+x+"!="+p);
	}
}
