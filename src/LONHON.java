import java.util.Scanner;

public class LONHON {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		while(A - B <= 0) {
			count++;
			A *= 3;
			B *= 2;
		}
		System.out.println(count);
	}
}
