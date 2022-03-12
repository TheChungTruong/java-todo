package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * Opt01: bắt lỗi trước khi xử lý function
 */
public class Ex01 {
	//chúng ta đã tạo một đối tượng của lớp Scanner có tên là input. 
		//Tham số System.in được sử dụng để lấy đầu vào.
		//Sau đó, chúng ta đã sử dụng phương thức nextLine() của lớp Scanner 
		//để đọc một chuỗi ký tự từ người dùng.
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
// Xác thực xem cái chuỗi mình nhập vào có phải là một số không, 
		// sau đó mới thực hiện nội dung trong if.
		// giá trị nhập vào là một string
		String yobsString = ip.nextLine();
		if (isNumber(yobsString)) {
			int yob = Integer.parseInt(yobsString);
			int cry = Year.now().getValue();
			System.out.println("Age: " + (cry - yob));
		} else {
			System.out.println("Invalid number !!!");
		}
	}

//	viet ham isNumber() tra ve gia tri kieu boolean
	// gia tri truyen vao la mot String.
	private static boolean isNumber(String sequence) {
		// phai lay tung ky tu 
		for (int index = 0; index < sequence.length(); index++) {
			//lấy từng phần tử của kiểu dữ liệu string ta dung ham charAt() 
			//sau đó gán cho letter.
			char letter = sequence.charAt(index);
//			sự dụng hàm Character.isDigit() để kiểm tra nó có phải một số không.
//			 nếu là số thì trả về true, nếu không phải thì trả về false.
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
//		nhớ đặt ngoài vòng for.
		return true;
	}

}
