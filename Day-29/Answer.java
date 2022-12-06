 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
		    int a=obj.nextInt();
		    int b=obj.nextInt();
		    int c=obj.nextInt();
		    int p=obj.nextInt();
		    int q=obj.nextInt();
		    int r=obj.nextInt();
		     
		    if(((a>p)&&(b>q))||((b>q)&&(c>r))||((c>r)&&(a>p)))
		        System.out.println("A");
		    else
		        System.out.println("B");
		}
	}
}
