import java.util.Scanner;

public class SUM4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] arr = new long[T];
		for(int i = 0; i < T; i++) {
			arr[i] = sc.nextLong();
		}
		for(int i = 0; i < T; i++) {
			System.out.printf("%.8f", output(arr[i]));
			System.out.println();
		}
	}
	public static double output(long a) {
		double sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		if(a == 0) {
			return 0;
		}
		return (1/sum) + output(a-1);
	}
}
