import java.util.Scanner;

public class VL11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		if(!Prime(n)) {
			System.out.println("NO");
		} else if(Prime(n)) {
			System.out.println("YES");
		}
	}
	public static boolean Prime(long n) {
		if(n < 2) {
			return false;
		} else if(n == 2) {
			return true;
		} else {
			for(long i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					return false;
				} 
			}
		}
		return true;
	}
}
