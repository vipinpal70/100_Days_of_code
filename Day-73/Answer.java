//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends

// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        int n=N;
        String res="";
        
        while(n!=0)
        {
            if(n%2==0)
            {
                res+=0;
            }
            else{
                res+=1;
            }
            n=n/2;
        }
        
        int count=0;
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)=='1')
            {
                count++;
            }
        }
        
        return count;
    }
}

