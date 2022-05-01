	import java.util.Scanner;
	
	public class DK07 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a == 0) {
				if(b == 0) {
					if(c == 0) {
						System.out.println("INF");
					} else {
						System.out.println("NO");
					}
				} else if(b > 0) { 
					if(c == 0) {
						System.out.println(c / b);
					} else {
						System.out.printf("%.2f", (-c) / b);
					}
				} else if(b < 0) {
					if(c == 0) {
						b = Math.abs(b);
						System.out.println(c / b);
					} else {
						System.out.printf("%.2f", (-c) / b);
					}
				}
			} else {
				double delta = b * b - 4 * a * c;
				if(delta < 0) {
					System.out.println("NO");
				} else if(delta == 0) {
					double n0 = -b / (2 * a);
					System.out.printf("%.2f", n0);
				} else {
					double n1 = (-b - Math.sqrt(delta)) / (2 * a);
					double n2 = (-b + Math.sqrt(delta)) / (2 * a);
					System.out.printf("%.2f %.2f", n1, n2); 
				}
			}
		}
	}
