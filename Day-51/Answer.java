//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
 

class Solution{
    static int min(int x, int y){
        if(x <= y)
            return x;
        return y;
    }
    
    static int nCr(int n, int r){
        int[] C = new int[r+1];
        for(int i = 0;i <= r;i++)
            C[i] = 0;
        // Top row of Pascal Triangle
        C[0] = 1; 
        
        // One by constructs remaining rows of Pascal 
    	// Triangle from top to bottom 
        for(int i = 0;i <= n;i++){
            // Fill entries of current row using previous 
    		// row values
            for(int j = min(i, r); j > 0; j--){
                // nCj = (n-1)Cj + (n-1)C(j-1);
                C[j] =(C[j] + C[j-1])%1000000007;
            }
        }
        return C[r]%1000000007;
    }
}
