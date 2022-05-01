import java.util.Scanner;

public class DK02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = Math.max(Math.max(a, b), c);
		sc.close();
		System.out.println(d);
	}
}
