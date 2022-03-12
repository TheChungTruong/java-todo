package inheritance.iinterface;

public class App {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Square();

		s1.drawing();
		s1.color();
		s2.drawing();
		s2.color();
//		Shape s3 = new Shape() {
//
//			@Override
//			public void drawing() {
//				// TODO Auto-generated method stub
//				System.out.println("Anonymous class");
//			}
//
//			@Override
//			public void color() {
//				// TODO Auto-generated method stub
//
//				System.out.println(" Color >> Blue");
//			}
//		};
		Shape s3 = new Anonymous();
		s3.color();
		s3.drawing();
	}
}
