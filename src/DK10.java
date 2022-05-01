import java.util.Scanner;

public class DK10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
		sc.close();
		if(year <= 0 || year > 10000) {
			System.out.println("INVALID");
		} else {
			if(month < 1 || month > 12) {
				System.out.println("INVALID");
			} else {
				switch (month) {
					case 1: {
						System.out.println(31);
						break;
					}
					case 3: {
						System.out.println(31);
						break;
					}
					case 5: {
						System.out.println(31);
						break;
					}
					case 7: {
						System.out.println(31);
						break;
					}
					case 8: {
						System.out.println(31);
						break;
					}
					case 10: {
						System.out.println(31);
						break;
					}
					case 12: {
						System.out.println(31);
						break;
					}
					case 4: {
						System.out.println(30);
						break;
					}
					case 6: {
						System.out.println(30);
						break;
					}
					case 9: {
						System.out.println(30);
						break;
					}
					case 11: {
						System.out.println(30);
						break;
					}
					case 2: {
						if((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
							System.out.println(29);
							break;
						} else {
							System.out.println(28);
							break;
						}
					}
				}
			}
		}
	}
}
