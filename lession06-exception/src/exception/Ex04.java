package exception;

import java.util.Arrays;

public class Ex04 {
	/*
	 * create Arrays have two element
	 */
	public static void main(String[] args) {
		int[] a = new int[2];
		test(a);
		System.out.println(Arrays.toString(a));
	}
	private static void test(int[] a) {
		a[0] = 1;
		a[1] = 2;
	}

}
