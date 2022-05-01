import java.util.Scanner;

public class VL18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		count(n);
	}
	public static void count(String n) {
		int index1 = n.length()-1;
		char index = n.charAt(index1);
		for(index1 = n.length()-1; index1 >= 0; index1--) {
			if(index != 0) {
				continue;
			} else {
				System.out.print(n.charAt(index1));
			}
		}
	}
}
