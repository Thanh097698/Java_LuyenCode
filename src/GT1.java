import java.util.Scanner;

public class GT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(factorial(n));
	}
	public static long factorial(int n) {
		long x = 1;
		for(int i = 1; i <= n; i++) {
			x *= i;
		}
		return x;
	}
}	
