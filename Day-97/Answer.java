 
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            Solution g=new Solution();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}


// } Driver Code Ends


/*you are required to complete this method */
class Solution {
    boolean res = false;
    boolean dp[][];
    public boolean isInterLeave(String a,String b,String c)
	{           
	        dp = new boolean[a.length()+1][b.length()+1];
             if(a.length() + b.length() != c.length()) return false;
            return help(a,b,c, 0, 0, 0);
	}
	boolean help( String a, String b, String c, int curA, int curB, int curC){
	    
	    if(curC == c.length()) return true;
	    if(dp[curA][curB]) return false;
	    boolean flg = false;
	    flg = curA < a.length() && a.charAt(curA) == c.charAt(curC) && help(a,b,c, curA+1, curB, curC+1)
	                    ||
	           curB < b.length() && b.charAt(curB) == c.charAt(curC) && help(a,b,c, curA, curB+1, curC+1);
	   if(!flg) dp[curA][curB] = true;
	   return flg;
	}
}

