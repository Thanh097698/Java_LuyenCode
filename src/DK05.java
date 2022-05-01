import java.util.Scanner;

public class DK05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = Math.round(Math.sqrt(a));
		if(a == b * b) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
