

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0)
		{
		    int r1=sc.nextInt();
		    int r2=sc.nextInt();
		   if(r1%2==0)
		   {
		       if(r1+2==r2 || r1-2==r2 || r1-1==r2)
		       {
		           System.out.println("YES");
		       }
		       else
		       {
		           System.out.println("NO");
		       }
		   }
		    if(r1%2!=0)
		   {
		       if(r1+2==r2 || r1-2==r2 || r1+1==r2)
		       {
		           System.out.println("YES");
		       }
		       else
		       {
		           System.out.println("NO");
		       }
		   }
		}
	}
}

