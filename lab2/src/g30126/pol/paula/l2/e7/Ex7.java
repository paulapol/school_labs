package g30126.pol.paula.l2.e7;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
static int comp(int a, int b)
{
	if(a>b) 
		{System.out.println("numar prea mic");
		return 0;
		}
	else if(a<b)
		{System.out.println("numar prea mare");
		return 0;
		}
	else {System.out.println("numar corect");
	return 1;
	}
    
}
	public static void main(String[] args)
	{
		 Random r = new Random();
	        int X=r.nextInt(5);
	        int i=1;
	        int g=0;
	        while(i<=3 && g==0)
	        {System.out.println("introduceti "+i+" varianta");
	        Scanner in = new Scanner(System.in);
		     int x = in.nextInt();
		     g=comp(X,x);
	        i++;
	        }
	        if(g==0) System.out.println("ai pierdut");
	        else System.out.println("ai castigat");
	        
	        
	}
}
