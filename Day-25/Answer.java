
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int numberTestCases = Integer.parseInt(sc.nextLine());
		
		while(sc.hasNextInt()){
		    String[] values = sc.nextLine().split(" ");
        
		    int coinsPlayA = Integer.parseInt(values[0]);
		    int coinsPlayB = Integer.parseInt(values[1]);
		    int coinsPlayC = Integer.parseInt(values[2]);
		    int coinsPlayD = Integer.parseInt(values[3]);
		    
		    if(coinsPlayA < coinsPlayB){
          
		        coinsPlayA = coinsPlayA + coinsPlayC;
          
		    } else {
          
		        coinsPlayB = coinsPlayB + coinsPlayC;
		    }
		    
		    if(coinsPlayA < coinsPlayB){
          
		        coinsPlayA = coinsPlayA + coinsPlayD;
          
		    } else {
          
		        coinsPlayB = coinsPlayB + coinsPlayD;
		    }
		    
		    if(coinsPlayA < coinsPlayB){
          
		        System.out.println("S");
          
		    } else {
          
		        System.out.println("N");
		    }
		    
		}
	}
}
