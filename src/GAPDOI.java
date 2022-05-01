import java.util.Scanner;

public class GAPDOI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int a = (int)x;
		if(x >= 0) {
			System.out.println(a + " " + a + 1);
		} else {
			System.out.println(a - 1 + " " + a);
		}
	}
}
