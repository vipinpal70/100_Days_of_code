

//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> a=new ArrayList<Integer>();
       Set<Integer> s=new HashSet<Integer>();
        Set<Integer> u=new HashSet<Integer>();
        Set<Integer> o=new HashSet<Integer>();
        
        for(int i:A)
        {
            s.add(i);
        }
        for(int j:B)
        {
           u.add(j);
        }
        for(int k:C)
        {
            if(s.contains(k) && u.contains(k))
            {
                o.add(k);
            }
            
        }
        Iterator<Integer> it = o.iterator();
        while(it.hasNext())
        {
            a.add(it.next());
        }
        Collections.sort(a);
        if(a.size()==0)
        {
            a.add(-1);
            return a;
        }
        else
        return a;
        
    }
}
