package released.version;

public interface father {
	void adn();

	default void playSport() {
		System.out.println("father >> football");
	}
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drinks" + quantity + "bottles");
	}
	private static void money() {
		System.out.println("father >> 500k");
	}
}
