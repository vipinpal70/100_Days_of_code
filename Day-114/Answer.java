
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

 

class Solution {
    public static int noConseBits(int n) {
        
     // Convert n to binary form
    String binary = Integer.toBinaryString(n);

    // Keep track of the result
    StringBuilder sb = new StringBuilder(binary);

    // Iterate over the binary string and remove consecutive set bits
    for (int i = 2; i < sb.length(); i++) {
        if (sb.charAt(i) == '1' && sb.charAt(i-1) == '1' && sb.charAt(i-2) == '1') {
            sb.setCharAt(i, '0');
        }
    }

    // Convert the modified binary string back to integer
    int result = Integer.parseInt(sb.toString(), 2);

    return result;
    }
}
        
        
