 

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends

 

//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
            
        }
        int max=0;
        int val=0,flag=0;
        for(int i=0;i<size;i++){
            if(map.get(a[i])>size/2){
                max=map.get(a[i]);
                val=a[i];
                flag=1;
            }
        }
        if(flag==0)
            return(-1);
    return(val);
    }
}

