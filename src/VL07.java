import java.util.Scanner;

public class VL07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		long a = combination(n, k);
		System.out.println(a);
	} 
	public static long combination(int n, int k) {
		long tich = 1;
		long tich1 = 1;
		
		if(k >= 15) {
			for(int i = k+1; i <=  n ; i++) {
				tich *= i;
			}
			for(int i = 1; i <= n-k; i++) {
				tich1 *= i;
			}
		}
		else if(k < 15) {
			for(int i = n-k+1; i <= n; i++) {
				tich *= i;
			}
			for(int i = 1; i <= k; i++) {
				tich1 *= i;
			}
		}
		return tich / tich1;
	}
}
