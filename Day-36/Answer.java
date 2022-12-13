 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
	        for(int i=1;i<=t;i++){
		    int ini = 8;
		    int N = obj.nextInt();
		    for(int j=1;j<=N;j++){
		        int H = obj.nextInt();
		        if(H%7!=6 && H%7!=0)
		        ini++;
		    }
		    System.out.println(ini);
	
	        }
	    }
}

