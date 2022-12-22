 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x,y,z;
		Scanner sc  = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0)
		{
		    x = sc.nextInt();
		    y = sc.nextInt();
		    z = sc.nextInt();
		    
		    if(z>=x+y)
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
