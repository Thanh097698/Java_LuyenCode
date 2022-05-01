import java.util.Scanner;

public class VL08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(Sum(a, b));
	}
	public static int Sum(int a, int b) {
		int x = 0;
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				x += i;
			}
		}
		return x;
	}
}
