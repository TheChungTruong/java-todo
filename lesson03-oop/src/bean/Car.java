package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	private double price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String serial, String model, String color) {
		//this.serial = serial;
		//this.model = model;
		//this.color = color;
		this(serial, model, color, 0d);
	}
	

	public Car(String serial, String model, String color, double price) {
		this.serial = serial;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Car)) {
			return false;
		} 
		Car that = (Car)obj;
		if(getSerial() == null) {
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return serial + " , " + model + " , " + color;
	}

}
