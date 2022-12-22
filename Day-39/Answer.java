 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(((n+1)*y)<x){
		        System.out.println("no");
		    }else{
		        System.out.println("yes");
		    }
	}
		
	}
}
