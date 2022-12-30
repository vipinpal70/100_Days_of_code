

class Solution
{
   
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int plat_needed = 1;
        int res = 1;
        
        for(int i=0; i<n; i++){
            plat_needed = 1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    if(arr[i]>=arr[j] && dep[j]>=arr[i])
                    plat_needed++;
                }
            }
            res = Math.max(plat_needed, res);
        }
        
        return res;
    }
    
}
