
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
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.is_valid(s);
            System.out.println(ans);
        }
    }
}




class Solution
{
     public int is_valid(String s) {
        int x = 0;
        int y = s.length();
            java.util.regex.Pattern p = java.util.regex.Pattern.compile("");
            if (p.matches("[0-9]{"+y+"}", s)) {
                
                if (y== 10) {
                    if (p.matches("[789][0-9]{9}", s)) {
                        x = 1;
                    }
                }
                if (y == 11) {
                    if (p.matches("[0][789][0-9]{9}", s)) {
                        x = 1;
                    }
                }
                if (y == 12) {
                    if (p.matches("[9][1][789][0-9]{9}", s)) {
                        x = 1;
                    }
                }
            }
       
        return x;
    }
}
