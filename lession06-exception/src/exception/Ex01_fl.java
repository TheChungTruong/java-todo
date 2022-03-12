package exception;

import java.time.Year;
import java.util.Scanner;

public class Ex01_fl {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String yobsString = enterYear();
		int cry = Year.now().getValue();
		int yob = Integer.parseInt(yobsString);
		System.out.println("Age: " + (cry - yob));
	}
	private static String enterYear() {
		String yobsString = null;
		do {
			System.out.println("Enter year your birth: ");
			yobsString = ip.nextLine();
		}while (!yobsString.matches("\\d+"));
		
		return yobsString;
	}
}
