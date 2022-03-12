package bean;
/**
 * Class Rectangle >> Create some object
 * + attribute: width, height
 *
 */
public class Rectangle {
	// Attributes
	private int width;
	private int height;
	
	// Default empty constructor 
	//Cần khai báo, khi  có hàm Constructor with parameter.
	public Rectangle() {
		
	}
	
	// Constructor with parameter
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
		
	//getter,getter
		public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "w" + this.width + ", h" + this.height;
	}	
}
