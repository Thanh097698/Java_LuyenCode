import java.util.Scanner;

public class MAGPERM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(k == 0) {
			for(int i = 1; i <= n; i++) {
				System.out.print(i + " ");
			}
		}
		else if(k != 0 && n % (2 * k) != 0) {
			System.out.println(-1);
		} else {
			int size = n / (2 * k);
			int start = 1;
			int finish = 2*k; 
			int[] arr = new int[n];
			for(int i = 1; i <= n; i++) {
				arr[i] = i;
			}
			int temp;
			while (size > 0) {
				size --;
				for(int i = start; i <= finish / 2; i++) {
					temp = arr[i];
					arr[i] = arr[i+k];
					arr[i+k] = temp;
				}
				start += 2*k;
				finish += 2*k;
			}
			for(int i = 1; i <= n; i++) {
				System.out.print(arr[i] +" ");
			}
		} 
	}
}
