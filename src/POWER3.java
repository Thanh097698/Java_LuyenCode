import java.util.Scanner;

public class POWER3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			long N = sc.nextLong();
			if(N == Math.pow(Math.pow(N, (double)1/3), 3)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
