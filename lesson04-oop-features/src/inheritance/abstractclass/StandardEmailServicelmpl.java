package inheritance.abstractclass;

public class StandardEmailServicelmpl extends EmailService implements Transformer{

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("StandarEmailServiceImpl >> login ...");
	}
	@Override
	public void send(boolean safeMode) {
		// TODO Auto-generated method stub
		System.out.println("StandardEmailServicelmpl >> send with safeMode" + safeMode);
	}

}
