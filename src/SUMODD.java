import java.util.Scanner;

public class SUMODD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long sum = 0;
		for(long i = l; i <= r; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
