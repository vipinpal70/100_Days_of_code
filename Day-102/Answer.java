//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Pair{
    int row;
    int col;
    int time;
    Pair(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {   
        // int[][] temp = grid;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        Queue<Pair> q = new LinkedList<>();
        int cntFresh = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    cntFresh++;
                }
                else if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                }
            }
        }
  
        // q.add(new Pair(0,0,0));
        
        int[] dRow = {-1,0,+1,0};
        int[] dCol = {0,+1,0,-1};
        int count = 0;
        int tm = 0;
        while(q.isEmpty() == false){
            Pair rp = q.remove();
            int row = rp.row;
            int col = rp.col;
            int time = rp.time;
            
            tm = Math.max(tm,time);
            for(int i = 0; i < 4; i++){
                int nRow = dRow[i] + row;
                int nCol = dCol[i] + col;
                
                if(nRow >= 0 && nCol >= 0 && nRow < grid.length && nCol < grid[0].length 
                && vis[nRow][nCol] == false && grid[nRow][nCol] == 1){
                    q.add(new Pair(nRow,nCol,time+1));
                    vis[nRow][nCol] = true;
                    count++;
                }
            }
        }
        if(count != cntFresh){
            return -1;
        }
        return tm;
    }
}

