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
            ArrayList<Integer> result = ob.barcketNumbers(S);
            for(Integer value : result){
                System.out.println(value);
            }
            
        }
    }
}

class Solution {
    ArrayList<Integer> barcketNumbers(String S) {
        // code here
        int count1=0;
        int count2=0;
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                
                count1++;
                st.push(count1);
                ar.add(count1);
            }
            else if(S.charAt(i)==')'){
               
                ar.add(st.pop());
            }
        }
        return ar;
    }
};
