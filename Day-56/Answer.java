//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends
 

class Solution {
    int countTriplet(int arr[], int n) {
        int ans = 0;
        Arrays.sort(arr);
        for(int i=n-1; i>1; i--) {
            int num = arr[i];
            int j = 0;
            int k = i-1;
            while(j<k) {
                int sum = arr[j] + arr[k];
                if(sum == num) {
                    ans++;
                    j++;
                    k--;
                }
                else if(sum < num) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return ans;
    }
}

