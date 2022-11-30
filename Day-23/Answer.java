import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();
            String ans = ob.compareFrac(s);
            System.out.println(ans);
        }
    }
}


class Solution{
    String compareFrac(String s){
        String ss = "";  int lo = 0;
        String wd[] = s.split(", ");
        int lnwd = wd.length;
        double[] re = new double[2];
        for (int i = 0; i < lnwd; i++) {
            String ch = wd[i];
            int se = ch.length();
            int in = ch.indexOf('/');
            char[] cha = new char[in];
            char[] cha1 = new char[(se-in)];
            for (int j = 0; j < in; j++) {
                cha[j] = ch.charAt(j);
            }
            String bf = new String(cha);
            for (int j = in+1; j <= ch.length()-1; j++) {
                cha1[j-(in+1)] = ch.charAt(j);
            }
            String af = new String(cha1);
            Double d1 = Double.parseDouble(bf);
            Double d2 = Double.parseDouble(af);
            if(0 < (d1/d2)){
                re[lo] = (d1/d2);
                lo++;
                
            }
            if(re[0] > re[1]){
                ss = wd[0];
            }
            else if(re[0]<re[1]){
                ss = wd[1];
            }
            else{
                ss = "equal";
            }
        }
        return ss;
    }
    
}
