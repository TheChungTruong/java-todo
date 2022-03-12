package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer, AuthorizationService{

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl >> login ...");
	}
	@Override
	void loginWith2Step() {
		System.out.println("BusinessEmailServiceImpl >> loginWith2Step");
	}
	@Override
	public void send(boolean safeMode) {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl >> send with safeMode" + safeMode);
	}
	@Override
	public void authorize(String a) {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationService >> a: " + a);
		
	}
	

}
