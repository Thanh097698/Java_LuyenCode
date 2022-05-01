import java.util.Scanner;

public class VL13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		if(Sum(n) == n) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	public static long Sum(long n) {
		long sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
