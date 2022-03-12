package exception;

public class Ex03 {
/*
 * Opt3: Check condition and throw exception before calling function 
 * math: a/b.
 */
public static void main(String[] args) {
	int a = 5;
	int b = 0;
	System.out.println("a/b : " + divide(a,b));
}
private static int divide(int a, int b) {
	if(b==0) {
		throw new ArithmeticException("-- by zeros --");
	}
	return a/b;
}

}
