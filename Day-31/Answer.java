 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        long t= sc.nextLong();
        while(t-->0)
        {
            long n =sc.nextLong();
            long k =sc.nextLong();

            if(n==0){
                System.out.println(0);
            }else if(n%k==0){
                System.out.println(n/k);
            }else{
                System.out.println(-1);
            }
        }
	}
}
