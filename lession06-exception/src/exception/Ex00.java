package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * Tính tuổi của ứng viên
 * Nhập vào năm sinh
 * số tuổi = lấy năm hiện tại trừ cho năm sinh
 */
public class Ex00 {
//	-Khai báo static vì muốn dùng nó trog hàm main, 
//	 khi gọi thông qua class mà không không cần thông qua đối thương nào cả. 
//	-Kiểu private vì muốn sử dụng trong file này thôi.
//	-Khai báo bên ngoài hàm main vì muốn khởi tạo một thằng duy nhất thôi, 
//	 bỏ trong hàm main cũng được mà bỏ bên ngoài gọn hơn
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
//		hàm này dùng để nhập một số nguyên vào
//      hàm này ngắn gọn nhưng không dùng hàm này vì nó dễ bị trôi lệnh
//      int year = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());
//      có một class là year và khi Year.now() thì nó sẽ trả về số năm của mình
//      những chỉ muốn giá trị số của nó thôi nên ta .getValue
		int cry = Year.now().getValue();
//	    in ra số tuổi cần tính
		System.out.println("Age: " + (cry - yob));
	}

}
