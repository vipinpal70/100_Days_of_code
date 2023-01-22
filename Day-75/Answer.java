 //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			int [][] mat = new int[N][M];
			for(int i = 0; i < N; i++) {
				str = br.readLine().trim().split(" ");
				for(int j = 0; j < M; j++) {
					mat[i][j] = Integer.parseInt(str[j]);
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.water_flow(mat, N, M));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int water_flow(int [][] mat, int N, int M)

int dx[] = {0, 0, -1, 1};
int dy[] = { -1, 1, 0, 0};
int n, m;

void call(int x, int y, vector<vector<int>>&mat, vector<vector<int>> &vis) {
    vis[x][y] = 1;
    
    for (int i = 0; i < 4; i++) {
        int xx = x + dx[i];
        int yy = y + dy[i];
        if (xx >= 0 && yy >= 0 && xx < n && yy < m && vis[xx][yy] == 0 && mat[x][y] <= mat[xx][yy]) {
            call(xx, yy, mat, vis);
        }
    }
}


int water_flow(vector<vector<int>> &mat, int a, int b) {
    // Write your code here.
    n = a; m = b;
    
    vector<vector<int>> vis(n, vector<int>(m, 0));
    vector<vector<int>> vis2(n, vector<int>(m, 0));
    
    for (int i = 0; i < n; i++) {
        if (vis[i][0] == 0) call(i, 0, mat, vis );
        if (vis2[i][m - 1] == 0) call(i, m - 1, mat, vis2);
    }
    for (int j = 0; j < m; j++) {
        if (vis[0][j] == 0) call(0, j, mat, vis);
        if (vis2[n - 1][j] == 0) call(n - 1, j, mat, vis2);
    }
    
    
    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (vis[i][j] && vis2[i][j]) ans++;
        }
    }
    return ans;    
	}
}

