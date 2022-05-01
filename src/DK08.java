import java.util.Scanner;

public class DK08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		char c = sc.next().charAt(0);
		double b = sc.nextDouble();
		double d;
		switch (c) {
			case '+': {
				d = a + b;
				System.out.printf("%.2f", d);
				break;
			}
			case '-': {
				d = a - b;
				System.out.printf("%.2f", d);
				break;
			}
			case '*': {
				d = a * b;
				System.out.printf("%.2f", d);
				break;
			} 
			case '/': {
				if(b == 0) {
					System.out.println("Math Error");
					break;
				} else {
					d = a / b;
					System.out.printf("%.2f", d);
					break;
				}
			}
		}
	}
}
