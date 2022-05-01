import java.util.Scanner;

public class VL17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = count(a);
		System.out.println(b);
	}
	static int count(int a) {
		int count = 0;
		int b = Math.abs(a);
		for(int i = 1; i <= b; i++) {
			if(a % i == 0) {
				count += 1;
			}
		}
		return count;
	}
}
