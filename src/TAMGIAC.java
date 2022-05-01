import java.util.Scanner;

public class TAMGIAC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		output(a, b, c);
	}
	public static boolean check(long a, long b, long c) {
		if((a + b) > c && (b + c) > a && (c + a) > b) {
			return true;
		}
		return false;
	}
	public static void output(long a, long b, long c) {
		if(!check(a, b, c)) {
			System.out.println("NO");
		}
		else {
			long cv = a + b + c;
			System.out.print(cv + " ");
			double ncv = (double) cv / 2;
			double s = (double)Math.sqrt(ncv * (ncv - a) * (ncv - b) * (ncv - c));
			System.out.printf("%.2f",s);
		}
	}
}
