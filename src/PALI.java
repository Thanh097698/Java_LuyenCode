import java.util.Scanner;

public class PALI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(!check(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	static boolean check(int a) {
		if(a == Reverse(a)) {
			return true;
		} else {
			return false;
		}
	}
	static int Reverse(int a) {
		int count = 0;
		while(a > 0) {
			int du = a % 10;
			count = count * 10 + du; 
			a /= 10;
		}
		return count;
	}
}
