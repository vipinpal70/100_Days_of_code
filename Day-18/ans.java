
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt(); 	  // n teams
		int a = sc.nextInt(); 	  // a time to process task
		int b = sc.nextInt(); 	  // b break time after task
		int test = sc.nextInt();  // tase cases
    
		while (test > 0) {
      
			if (n % 2 == 0) {
        
				int time = 0;
				while (n > 1) {
          
					time = time + a;
					n = n / 2;
					if (n > 1) {
            
						time = time + b;
					}
				}
				System.out.println(time);
			}
		    test--;
		}
		sc.close();
	}
}
