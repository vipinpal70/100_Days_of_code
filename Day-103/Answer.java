//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class Chainlength
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Pair pr[] = new Pair[n];
            int arr[] = new int[2*n];
            for(int i = 0; i < 2*n; i++)
            {
               arr[i] = sc.nextInt();
            }
            for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
            {
                pr[j] = new Pair(arr[i], arr[i+1]);
            }
            GfG g = new GfG();
            System.out.println(g.maxChainLength(pr, n));
        }
    }
}

// } Driver Code Ends


/*
class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
*/

class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Comparator<Pair> cmp = new Comparator<>(){
         public int compare(Pair a, Pair b){
            if(a.y == b.y){
                return a.x-b.x;
            }
            return a.y-b.y;
         }
       };
       Arrays.sort(arr, cmp);
       int ans = 1;
       int a = arr[0].x;
       int b = arr[0].y;
       for(int i =1;i<n;i++){
           if(b<arr[i].x){
               ans++;
               a = arr[i].x;
               b = arr[i].y;
           }
       }
       return ans;
       
    }
}

