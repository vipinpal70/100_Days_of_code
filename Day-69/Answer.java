

#include <bits/stdc++.h>
using namespace std;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        boolean visited[]=new boolean[V];
        Queue<Integer>q=new LinkedList<>();
        visited[0]=true;
        q.add(0);
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans.add(node);
            for(Integer i:adj.get(node))
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return ans;
    }
}

//{ Driver Code Starts.
int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int V, E;
        cin >> V >>

            E;

        vector<int> adj[V];

        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
            // 		adj[v].push_back(u);
        }
        // string s1;
        // cin>>s1;
        Solution obj;
        vector<int> ans = obj.bfsOfGraph(V, adj);
        for (int i = 0; i < ans.size(); i++) {
            cout << ans[i] << " ";
        }
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends
