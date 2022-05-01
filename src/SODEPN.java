import java.util.Scanner;

public class SODEPN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int count = 0;
		while(N != 0) {
			count += N % 10;
			N /= 10;
		}
		System.out.println(count);
	}
}
