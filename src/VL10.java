import java.util.Scanner;

public class VL10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		char index1 = n.charAt(0);
		int a = count(n, index1);
		System.out.println(a);
	}
	public static int count(String n, char index1) {
		int count = 0;
		if(index1 == '-') {
			for(int i = 0; i < n.length()-1; i++) {
				count++;
			} 
		} else {
			for(int i = 0; i < n.length(); i++) {
				count++;
			}
		}
		return count;
	}
}
