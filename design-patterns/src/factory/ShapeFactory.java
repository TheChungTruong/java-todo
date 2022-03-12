package factory;

public class ShapeFactory {
	private ShapeFactory() {
	}

	public static Shape reateRectangle() {
		return new Rectangle();
	}

	public static Shape reateSquare() {

		return new Square();
	}

}
