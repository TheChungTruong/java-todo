package math;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;		
		int min = Math.min(a,b);
		float c = 7.49f;
		int round = Math.round(c);
		double ceil = Math.ceil(c);
		double floor = Math.floor(c);
		System.out.println("min: " + min);
		System.out.println("round: " + round);
		System.out.println("ceil: " + ceil);
		System.out.println("floor: " + floor);
	}

}