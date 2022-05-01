import java.util.Scanner;

public class SUMDIG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] arr = new long[T];
		for(int i = 0; i < T; i++) {
			arr[i] = sc.nextLong();
		}
		for(int i = 0; i < T; i++) {
				System.out.println(output(arr[i]));
		}
	}
	public static long output(long a) {
		long sum = 0;
		while(a != 0) {
			sum += a % 10;
			a /= 10;
		}
		return sum;
	}
}
