 

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.noOfWays(M,N,X));
        }
    }
}
 

class Solution {
    static long noOfWays(int M , int N , int X) 
    {
        long [] [] dp=new long [N+1][X+1];
        for(long [] rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        long c=find(M,N,X,dp);
        
        return c;
    }
    static long find(int m,int dice,int target,long [][] dp)
    {
        if(target<0) return 0;
        if(dice==0 && target!=0) return 0;
        if(target==0 && dice!=0) return 0;
        if(dice==0 && target==0) return 1;
        if(dp[dice][target]!=-1) return dp[dice][target];
        long ans=0;
        for(int i=1;i<=m;i++)
        {
        
            ans=ans+find(m,dice-1,target-i,dp);
        
        }
        return dp[dice][target]=ans;
    }
}
 
