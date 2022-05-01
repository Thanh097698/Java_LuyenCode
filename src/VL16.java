import java.util.Scanner;

public class VL16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(BCNN(a, b));
	}
	public static int UCLN(int a, int b) {
		if(b == 0) {
			return Math.abs(a);
		} else {
			return UCLN(Math.abs(b), Math.abs(a % b));
		}
	}
	public static int BCNN(int a, int b) {
		int lcm = Math.abs(a * b) / UCLN(a, b);
		return lcm;
	}
}
