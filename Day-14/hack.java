
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());   //taking testCase
      while(testCases>0){
         String pattern = in.nextLine();      // taking String for pattern
          try{
              Pattern p = Pattern.compile(pattern);  // checking pattern 
              System.out.println("Valid");
          }catch(Throwable t){
              System.out.println("Invalid");
          }
          testCases--;
             
      }
   }
}
