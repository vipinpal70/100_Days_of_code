 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0){
		    int b=sc.nextInt();
        
		    if(b%2!=0){
		        b-=1;
		    }
		    System.out.println((((b * b) / 2) - b) / 4);
		}
	}
}

