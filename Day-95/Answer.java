 
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends
 
class meeting{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
class meetingcomparator implements Comparator<meeting>{
    public int compare(meeting o1,meeting o2){
        if(o1.end<o2.end){
            return -1;
        }
        else if(o1.end>o2.end){
            return 1;
        }
        else if(o1.pos<o2.pos){
            return -1;
        }
        return 1;
    }
}
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i=0;i<n;i++){
            meet.add(new meeting(start[i],end[i],i+1));
        }
        meetingcomparator mc = new meetingcomparator();
        Collections.sort(meet,mc);
        ArrayList<Integer> ans = new ArrayList<>();
        int limit=meet.get(0).end;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(meet.get(i).start>limit){
                limit=meet.get(i).end;
                cnt+=1;
            }
        }
        
       return cnt; 
    }
}
