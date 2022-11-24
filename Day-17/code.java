
import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		for(int z=0; z<t; z++){
		    int n = s.nextInt();
		    
		    String ans = "YES";
		    
		    int[] prices = new int[2*n];
		    
		    for(int i=0; i<2*n; i++){
		        prices[i] = s.nextInt();
		    }
		    
		    for(int j=0; j<2*n; j++){
		        int a = prices[j];
		        int count = 0;
		        for(int k=0; k<2*n; k++){
		            if(prices[k]==a) count++;
		        }
		        if(count>=3){
		            ans = "NO";
		            break;
		        }
		    }
		    
		    System.out.println(ans);
		    
		}
	}
}
