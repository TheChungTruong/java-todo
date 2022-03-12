package inheritance.abstractclass;

public abstract class EmailService {
	abstract void login();

	void loginWith2Step() {
		System.out.println("loginWith2Step >> drawing ");
	}
}
