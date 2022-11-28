import java.io.*;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
class Solution {
    long ExtractNumber(String S) throws NumberFormatException {
        long re = -1;
        String words[] = S.split("\\s");
        for (String str : words) {
            int l = str.length();
            boolean tr = Pattern.matches("[0-8]{" + l + "}", str);
            try {
                if(tr){
                    long x = Long.parseLong(str);
                    if (x > re) {
                        re = x;
                    }
                }
            } catch (Exception e) {
                //
            }
        }
        return re;
    }
}
