package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * 
 * Opt02: Dùng khối Try catch để bắt lỗi.
 */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = 0;
		try {
			yob = Integer.parseInt(ip.nextLine());
			int cry = Year.now().getValue();
			System.out.println("Age: " + (cry - yob)); 
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

}
