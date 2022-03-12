package polymorphsim.method;

public class App {

	public static void main(String[] args) {
		MathUntils.sum(1, 2);
		MathUntils.sum(1, 2, 3);
		SubPmo sub = new SubPmo();
		System.out.println("Sub: " + sub);

		System.out.println("Sub: " + sub.coding());
	}

}
