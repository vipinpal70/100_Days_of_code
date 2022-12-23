 

import java.util.*;
import java.lang.*;
import java.io.*;

 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++){
		int size=sc.nextInt();
		int count=0;
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		for(int i=0;i<size;i++){
		    arr1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
		    arr2[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
		    if(arr1[i]==arr2[i]){
		       count++;
		    }
		}
		System.out.println(count);
		
	}
}
}

