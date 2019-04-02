package g30126.pol.paula.l2.e3;

import java.util.Scanner;
public class ex3 {
	 static int prime_number (int nr)
	 {
		 int i,d=0;
		 for(i=1;i<=nr;i++)
		  if(nr%i==0)
		  {
			  d++;
		  }
	 if(d==2)
	 {
		 return 1;
	 }
	 else 
	 {
		 return 0;
	 }
}
  static void f1(int A,int B,int nr)
  {
	  int i;
	  nr=0;
	  for(i=A;i<B;i++)
		  if(prime_number(i)==1)
		  { 
			  nr++ ;
              System.out.println(i);
		  }
	  System.out.println("Sunt: "+nr);
  
  }
  public static void main (String[] args)
  {
	  System.out.println("introduceti 2 numere");
	  Scanner in=new Scanner(System.in);
	  int nr=0;
	  int A=in.nextInt();
	  int B=in.nextInt();
	  f1(A,B,nr);
  }
}