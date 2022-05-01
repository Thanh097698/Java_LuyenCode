import java.util.Scanner;

public class SUMDIV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < T; i++) {
			System.out.println(sum(arr[i]));
		}
	}
	public static boolean check(int a) {
		int x = (int) Math.sqrt(a);
		if(x * x == a) {
			return true;
		}
		return false;
	}
	public static int sum(int a) {
		int sum = 0;
		for(int i = 1; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				sum += i + a / i;
			}
		}
		if(check(a)) {
			sum = (int) (sum - Math.sqrt(a));
		}
		return sum;
	}
}
