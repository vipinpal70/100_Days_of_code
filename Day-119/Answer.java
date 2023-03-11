
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class JavaMD5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	try {
    		Scanner in = new Scanner(System.in);
        
    		MessageDigest md5 = MessageDigest.getInstance("MD5");
        
    		byte[] bytes = md5.digest(in.nextLine().getBytes());
        
    		in.close();
        
    		System.out.printf("%32x\n", new BigInteger(1, bytes));
    				
		} catch (Exception e) {
        
		e.printStackTrace();
        
		}
      
    }
}

