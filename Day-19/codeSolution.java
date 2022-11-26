import java.util.*;
 
class Codechef {
	public static boolean primeN(int x) {
		int end = x / 2;
		int j = 2;
		while (j <= end) {
			if (x % j == 0) {
				return false;
			}
			j++;
		}
		return true;
	}
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((1 <= a && a <= 6) && (1 <= b && b <= 6)) {
				if (primeN(a + b)) {
					System.out.println("Alice");
				} else {
					System.out.println("Bob");
				}

			}

			t--;
		}
	}
}
