 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 
		Scanner sc=new Scanner(System.in);
		int T,H,x,y,C;
		T=sc.nextInt();
		while(T-->0)
		{
		    H=sc.nextInt();
		    x=sc.nextInt();
		    y=sc.nextInt();
		    C=sc.nextInt();
		    int m=x+(y/2);
		    if(m*H<=C)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
