package demo;

import factory.Shape;
import factory.ShapeFactory;

public class App {
	public static void main(String[] args) {
		Shape s1 = ShapeFactory.reateRectangle();
		Shape s2 = ShapeFactory.reateSquare();
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
