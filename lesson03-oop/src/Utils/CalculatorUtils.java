package Utils;

public class CalculatorUtils {
	// dua ham khoi tạo ve private de khong cho bat cu ham nao khoi tao ra
	// doi tuong
	private CalculatorUtils() {
	}

	// non-static: khong phu thuoc vao doi tuong dang goi,
	// ma chi phu thuoc vao gia tri truyen vao thoi
	public static int sum(int a, int b) {
		return a + b;
	}

}
