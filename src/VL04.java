import java.util.Scanner;

public class VL04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.printf("%.4f", Sum(n));
	}
	public static double Sum(int n) {
		double x = 0;
		for(int i = 2; i <= n; i++) {
			x += (double)1 / i;
		}
		return x;
	}
}	
