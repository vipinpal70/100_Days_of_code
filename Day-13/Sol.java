import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) { 
        int l1 = a.length(); 
        int l2 = b.length();
        int i = 0; 
        boolean flag = false;  // checking character frequency inside string
        while (i < l1) {
            int x = 0, y = 0;
            char ch = a.charAt(i);     // taking ith character to check frequency
            try{     //handling error! ---> StringIndexOutOfBoundsException

                for (int j2 = 0; j2 < l1; j2++) {      // 1st string 
                    if (Character.compare(ch, a.charAt(j2)) == 0) {  
                        x++;   // increasing value of x  
                    } 
                }
                for (int j = 0; j < l2; j++) {      //2nd String 
                    if (Character.compare(ch, a.charAt(j)) == 0) {  
                        y++;      // increasing value of y  
                    } 
                }
                if (x == y) { 
                    flag = true;      // if frequency equal , set flag true
                }
            }
            catch(StringIndexOutOfBoundsException e){
                flag = false;
            }
            
            i++;

        }

        return flag;   // returing the flag value

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();        //taking 1st String
        String b = scan.next();        //taking 2nd string
        scan.close();
        boolean ret = isAnagram(a, b);    // caling method
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
