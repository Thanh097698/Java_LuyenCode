import java.util.Scanner;

public class DK09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		if(year <= 0 || year > 1000000) {
			System.out.println("INVALID");
		} else {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				if(year % 4 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
