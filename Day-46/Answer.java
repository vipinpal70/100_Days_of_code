 

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
    
		while(t-->0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int d = s.nextInt();
		    if(c>=a && b+d>=a){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
