 
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		}
	}
}
// } Driver Code Ends

 

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int gas[], int cost[]) {

        int n = gas.length;
        
        int possible = 0;
		for(int i = 0; i < n; i++) possible += gas[i]-cost[i];
		if(possible < 0) return -1;
		
		
		
		int totalFuel = 0, startingPoint = 0;
		for(int i = 0; i < n; i++){
			totalFuel += gas[i]-cost[i];
			if(totalFuel < 0){
				startingPoint = i+1;
				totalFuel = 0;
			}
		}
		if(totalFuel >= 0) return startingPoint;
		return -1;
    }
}

