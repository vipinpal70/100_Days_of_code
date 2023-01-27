//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends

 

//User function Template for Java
class Solution {
    static int findMaxLen(String str) {
        int n = str.length();
        Stack<Integer> st = new Stack<>();
        
        st.add(-1);
        
        int ans = 0;
        
        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);
            
            if(ch == '(')
            {
                st.add(i);
            }
            else 
            {
                st.pop();
                
                if(st.isEmpty())
                {
                    st.add(i);
                }
                
                else 
                    ans = Math.max(ans, i - st.peek());
            }
        }
        
        return ans;
        
    }
};
