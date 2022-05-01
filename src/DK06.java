import java.util.Scanner;

public class DK06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b == 0) {
			System.out.println("INF");
		} else if(a == 0) {
			System.out.println("NO");
		} else {
			double c = (double) -b/a;
			System.out.println(c);
		}
	}
}
