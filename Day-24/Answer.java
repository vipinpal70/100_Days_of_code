import java.util.*;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {

			int n = sc.nextInt();
			int[] ar = new int[n];
			int[] br = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			System.out.println("br start here");
			for (int i = 0; i < n; i++) {
				br[i] = sc.nextInt();
			}
			System.out.println("Calculation start here: ");
			int cnt = 0;
			for (int k = 0; k < n - 1; k++) {
				int time = ar[k + 1] - ar[k];
				if ( k == 0 && ar[0] == br[0]) {
					cnt = cnt + 1;	 
				}
				if (time <= br[k]) {
					cnt = cnt + 1;		 
				}
			}
			System.out.println(cnt);
			t--;
		}
		sc.close();
	}
}
