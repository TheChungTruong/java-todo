package released.version;

public class child implements father, Mother {

	@Override
	public void adn() {
		System.out.println("Father >> Child >>adn");
	}
	@Override
	public void playSport() {
		System.out.println("father >> child >> play tennis");
	}

}
