	import java.util.Scanner;
	
	public class VL15 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.close();
			PhanSo(a, b);
			
		}
		public static int UCLN(int a, int b) {
			if(b == 0) {
				return Math.abs(a);
			} else {
				return UCLN(Math.abs(b), Math.abs(a % b));
			}
		}
		public static void PhanSo(int a, int b) {
			if(b == 0) {
				System.out.println("INVALID");
			} else if(a % b == 0) {
				System.out.println(a / b);
			} else if(a % b != 0) {
				if((a < 0 && b < 0) || (a > 0 && b > 0)) {
					System.out.println(Math.abs(a) / UCLN(a, b) + " " + Math.abs(b) / UCLN(a, b));
				} else if(a > 0 && b < 0) {
					System.out.println("-" + a / UCLN(a, b) +" " + Math.abs(b) / UCLN(a, b));
				} else if(a < 0 && b > 0) {
					System.out.println(a / UCLN(a, b) +" " + b / UCLN(a, b));
				} else if(a == 0 && b != 0) {
					System.out.println(a / b);
				}
			}
		}
	}
