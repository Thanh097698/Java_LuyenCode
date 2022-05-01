import java.util.Scanner;

public class VL14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(UCLN(a, b));
	}
	public static int UCLN(int a, int b) {
		if(b == 0) {
			return Math.abs(a);
		} else {
			return UCLN(Math.abs(b), Math.abs(a % b));
		}
	}
}
