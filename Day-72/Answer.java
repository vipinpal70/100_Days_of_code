//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends

 

// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    public long ans;
    public long toh(int N, int from, int to, int aux) {
        // Your code here
        solve(N, from, to, aux);
        return ans;
    }
    
    public void solve(int N, int from, int to, int aux) {
        ans+=1;
        if(N==1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return;
        }
        solve(N-1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        solve(N-1, aux, to, from);
    }
}

