import java.util.Scanner;

public class NEXTCHAR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int b = (int)a;
		if(b >= 97 && b < 122) {
			b = b + 1;
		}
		else if(b == 122) {
			b = 97;
		}
		char c = (char)b;
		System.out.println(c);
	}
}
