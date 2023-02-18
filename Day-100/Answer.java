

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    int mod = 1000000007;
    int dp[] ;
    public int CountWays(String str)
    {
        if(str.charAt(0) == '0')return 0;
        
        dp = new int[10001];
        Arrays.fill(dp,-1);
        
        int n = str.length();
        
        return solve(str,n);
    }
    
    public int solve(String str,int n){
        
        if(n == 0 || n == 1) return 1;
        
        if(dp[n]!=-1) return dp[n];
        int cnt = 0;
        if(str.charAt(n-1) > '0')
        cnt = solve(str,n-1);
        
        if(str.charAt(n-2) == '1' || str.charAt(n-2) == '2' && str.charAt(n-1) < '7')
        cnt = (cnt+solve(str,n-2)%mod)%mod;
        
        return dp[n] = cnt;
        
    }
}

