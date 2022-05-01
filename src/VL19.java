import java.util.Scanner;

public class VL19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		Uoc(a, b);
	}
	static int check(int a, int b) {
		int count = 0;
		for(int i = (b-1); i > a; i--) {
			if(i % 3 == 0) {
				count ++;
			}
		}
		return count;
	}
	static void Uoc(int a, int b) {
		if(check(a, b) == 0) {
			System.out.println("NOT FOUND");
		} else {
			for(int i = (b-1); i > a; i--) {
				if(i % 3 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
