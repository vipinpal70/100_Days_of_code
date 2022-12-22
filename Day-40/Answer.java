 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
		    int x=sc.nextInt();
		    if(x%4==1)
		    System.out.println("EAST");
		    else if(x%4==2)
		    System.out.println("SOUTH");
		    else if(x%4==3)
		    System.out.println("WEST");
		    else 
		    System.out.println("NORTH");
		}
	}
}
