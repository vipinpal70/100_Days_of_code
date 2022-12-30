

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        
        if(arraySorted(arr,N)==1)
        {
            return 0;
        }
        
        // if(areSame(arr))
        // {
        //     return 0;
        // }
        
        long count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
        
    }
    static int arraySorted(long arr[], long n)
    {
        
        if (n == 1 || n == 0)
            return 1;
 
    
        if (arr[(int)n - 1] < arr[(int)n - 2])
            return 0;
 
        return arraySorted(arr, (int)n - 1);
    }
    
    static boolean areSame(long arr[])
    {
        
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            s.add((int)arr[i]);
        }
 
        
        if(s.size() == 1){
            return true;
        }
        return false;
    }
}
