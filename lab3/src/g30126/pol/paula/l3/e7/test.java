package g30126.pol.paula.l3.e7;


public class test {

    public static int solution(int[] A){
    	int i;
    	int b=0;
    	int nr=0;
    	for(i=0;i<A.length;i++)
    	{
    		int j;
    		
    		if(A[i]!=0) 
    		{
    			b=0;
    			for(j=i+1;j<A.length;j++)
    				if(A[j]==A[i] && b==0)
    			{ 
    				A[i]=0;
    				A[j]=0;
    				b=1;
    			}	
    		if(b==0) nr=A[i];
    		}
    	}    	
    	return nr;
     
    }

    public static void main(String[] args) {
        int[] A = new int[7];
        A[0] = 9;  A[1] = 3;  A[2] = 9;
        A[3] = 3;  A[4] = 9;  A[5] = 7;
        A[6] = 9;
        int result = solution(A);

        if(result==7)
            System.out.println("Rezultat corect.");
        else
            System.out.println("Rezultat incorect.");
    }
}
