import java.util.*;
public class Solution {
    static void byChar(String str) {    
        int l = str.length();  
        boolean bl = true;
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if(ch == str.charAt(l-1)){
                bl = true;
            }
            else{
                bl = false;
            }
            l--;
        }
        if (bl) {
            System.out.println("Yes");  // printing output
        } else {
            System.out.println("No");  // printing output
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        byChar(A);
        sc.close();
    }
}
