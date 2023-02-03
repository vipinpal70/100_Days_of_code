
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s1 = br.readLine().trim();
            String[] s2 = s1.split(" ");
            int a = Integer.parseInt(s2[0]);
            int r = Integer.parseInt(s2[1]);
            int n = Integer.parseInt(s2[2]);
            Solution ob = new Solution();
            int ans = ob.Nth_term(a, r, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution
{
    static int mod= 1000000007;
    public int Nth_term(int a, int r, int n)
    {
        // code here
        int t = (int)(a*pow(r,n-1)%mod);
        return t%mod;
    }
    static long pow(int x, int b){
        if(b == 0){
            return 1;
        }
        long temp = pow(x,b/2)%mod;
        temp = temp*temp%mod;
        if(b%2 == 0){
            return temp%mod;
        }
        return (x*temp)%mod;
    }
}

