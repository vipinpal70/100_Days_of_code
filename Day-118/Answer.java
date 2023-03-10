 
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.isDivisible(s));
                }
        }
}    
// } Driver Code Ends
 
 

class Solution {
    int isDivisible(String s) {
        int n = s.length();
        int evenSum = 0, oddSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            int bit = s.charAt(i) - '0';
            if ((i +1) % 2 == 0) {
                evenSum += bit;
            } else {
                oddSum += bit;
            }
        }
        int diff = evenSum - oddSum;
         if(diff % 3 == 0)
            return 1;
        return 0;
    }
}

