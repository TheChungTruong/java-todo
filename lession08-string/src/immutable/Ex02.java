package immutable;

public class Ex02 {
	private static int COUNT = 100000;
	public static void main(String[] args) {
		//Which one we use in reality
		//String literal
		
		// Save memory >> solve performance issue
		
	
		long start = System.currentTimeMillis(); 
		for(int i = 1; i <=COUNT; i++) {
			String s1 = "Welcome";
			String s2 = "Welcome";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration:" + (end - start));
	}

}