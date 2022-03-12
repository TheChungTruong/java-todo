package view;

import bean.Rectangle;

public class Ex01 {
	
	public static void main(String[] args) {
		// Demo create object from Rectangle class
		// R1:w8, h4
		// Rectangle
		// mới khởi tạo đối tượng chưa truyền giá trị của thuộc tính.
		//thì mỗi thuộc tính có giá tri mặc đinh.
		Rectangle r1 = new Rectangle(); // w0, h0
		// gắn giá trị.
		r1.setWidth(8);
		r1.setHeight(4);
		System.out.println("r1: " + r1);
		// r2: w10, h4
		Rectangle r2 = new Rectangle();
		r2.setWidth(10);
		r2.setHeight(4);
		System.out.println("r2: " + r2);
		// r3: w2, h6
		// khởi tạo giá trị và truyền giá trị
		Rectangle r3 = new Rectangle(2,6);
		System.out.println("r3: " + r3);
	}
}
