import java.util.Scanner;

public class VL21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(x(N));
	}
	public static int x(int N) {
		int sum = 0;
		int i = 1;
		while(sum <= N) {
			i++;
			sum += i;
			if(sum > N ) {
				i = i - 1;
			}
		}
		return i;
	}
}
