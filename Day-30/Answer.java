 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int D = sc.nextInt();
            int n = sc.nextInt();
            int sum=0;
            while(D-->0){
                sum = (n*(n+1))/2;
                n=sum;
            }
            System.out.println(sum);
        }
	}
}
