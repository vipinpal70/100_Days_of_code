 
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
 


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int n)
    {
        // your code here
        int[] freq = new int[10000001];
        for(int i=0; i<n; i++){
            freq[a[i]]++;
        }
        for(int i=0; i<1000000; i++){
            if(freq[i] > n/2){
                return i;
            }
        }
        return -1;
    }
}
