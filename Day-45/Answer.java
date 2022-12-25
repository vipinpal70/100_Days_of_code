 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0){
		   int a = scanner.nextInt();
		   int b = scanner.nextInt();
		   int c = scanner.nextInt();
		   int d = scanner.nextInt();
		   if(a==b && c==d){
		       System.out.println("YES");
		   }else if(b==c && a==d){
		       System.out.println("YES");
		   }else if(a==c && b==d){
		       System.out.println("YES");
		   }else{
		       System.out.println("NO");
		   }
		}
	}
}
