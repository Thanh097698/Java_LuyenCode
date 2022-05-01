import java.util.Scanner;

public class VL09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		sc.close();
		System.out.printf("%.2f", Sum(x, n));
	}
	public static double Sum(double x, int n) {
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.pow(x, i) / Factorial(i);
		}
		return sum;
	}
	public static long Factorial(int n) {
		long fac = 1;
		for(int i = 1; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}
}
