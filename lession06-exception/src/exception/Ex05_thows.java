package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_thows {
	public static void main(String[] args) {
		File file = creatNewFile("readme.md");
		boolean isSuccess = write(file);
		System.out.println("isSuccess: " + isSuccess);
		System.out.println("Back to Main method");

	}

	private static File creatNewFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}
//	hàm này trả về kiêu dữ liệu boolean(true or false) 
//	nó kiểm tra xem true > file đã được ghi, false là file chưa được ghi
	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
			write(fw, "Lession06 - Exception");
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return true;
	}
	// hàm để ghi
private static void write(FileWriter fw, String line) throws IOException {
	fw.write(line + "\n");
}
}
