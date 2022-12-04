

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Codechef main = new Codechef();
		Scanner sc = new Scanner(System.in);
		int numberTestCases = Integer.parseInt(sc.nextLine());
		
		
		while(sc.hasNextInt()){
		    String[] values = sc.nextLine().split(" ");
        
		    int coinsPlayA = Integer.parseInt(values[0]);
		    int coinsPlayB = Integer.parseInt(values[1]);
		    int coinsPlayC = Integer.parseInt(values[2]);
		    int coinsPlayD = Integer.parseInt(values[3]);
		    int plays[] = {coinsPlayA, coinsPlayB};
		    
		    main.summaryCoing(plays, coinsPlayC);
		    int rta[] = main.summaryCoing(plays, coinsPlayD);
		    if(rta[0] < rta[1]){
		        System.out.println("S");
		    } else {
		        System.out.println("N");
		    }
		    
		    
		}
	}
	
	private int[] summaryCoing(int [] values, int addCoins){
	    if(values[0] < values[1]){
	        values[0] = values[0]+addCoins;
	    } else {
	        values[1] = values[1]+addCoins;
	    }
	    //[0] < values[1] ? values[0] = values[0]+addCoins : values[1] = values[1]+addCoins;
	    return values;
	}
}
