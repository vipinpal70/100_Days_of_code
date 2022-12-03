 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int arr[] = new int[t];
		for(int i = 0; i<t;i++){
		    arr[i] = sc.nextInt();
		    String ss = Integer.toString(arr[i]);
		    int count = 0;
		    for(int j =0; j<ss.length(); j++){
		        if(ss.charAt(j) == '4'){
		            count += 1;
		        }
		    }
		   System.out.println(count); 
		}
		
	}
}
