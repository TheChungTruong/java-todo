package released.version;

public interface Mother {
void adn();
default void playPort() {
	System.out.println("Mother >> badminton ...");
}
static void drinklBeer(int qty) {
	System.out.println("Mother drinks " + qty + "bottles");
}
}
