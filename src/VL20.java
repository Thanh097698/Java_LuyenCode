import java.util.Scanner;

public class VL20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		int x = (int) a;
		int y = (int) b;
		for(int i = x - 32;  i <= y - 32; i++) {
			char z = (char) i;
			System.out.print(z + " ");
		}
	}
}
