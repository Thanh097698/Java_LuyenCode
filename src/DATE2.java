import java.util.Scanner;

public class DATE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int hour = s / 3600;
		int minutes = (s % 3600) / 60;
		int seconds = (s % 3600) % 60;
		if(hour < 10) {
			if(minutes < 10) {
				if(seconds < 10) {
					System.out.println("0" + hour + ":" + "0" + minutes + ":" + "0" + seconds);
				} else {
					System.out.println("0" + hour + ":" + "0" + minutes + ":" + seconds);
				}
			} else {
				if(seconds < 10) {
					System.out.println("0" + hour + ":" + minutes + ":" + "0" + seconds);
				} else {
					System.out.println("0" + hour + ":" + minutes + ":" + seconds);
				}
			}
		} else {
			if(minutes < 10) {
				if(seconds < 10) {
					System.out.println(hour + ":" + "0" + minutes + ":" + "0" + seconds);
				} else {
					System.out.println(hour + ":" + "0" + minutes + ":" + seconds);
				}
			} else {
				if(seconds < 10) {
					System.out.println(hour + ":" + minutes + ":" + "0" + seconds);
				} else {
					System.out.println(hour + ":" + minutes + ":" + seconds);
				}
			}
		}
	}
}
