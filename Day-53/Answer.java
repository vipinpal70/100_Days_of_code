//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}
// } Driver Code Ends
 

//User function Template for Java

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> stocks = new ArrayList<>();
        int initialStock = 0;
        int stockPrice = A[0];
        for(int i=1; i<n; i++) {
            ArrayList<Integer> possiblity = new ArrayList<>();
            if (stockPrice > A[i]) {
                stockPrice = A[i];
                initialStock = i;
                continue;
            }
            int previousStockPrice = A[i];
            for(int j=i+1; j<=n; j++) {
                if (j<n && previousStockPrice < A[j]) {
                    previousStockPrice = A[j];
                } else {
                    possiblity.add(initialStock);
                    possiblity.add(j-1);
                    stocks.add(possiblity);
                    initialStock = j;
                    i = j;
                    if (j<n) {
                        stockPrice = A[j];
                    }
                    break;
                }
            }
        }
        return stocks;
    }
}
