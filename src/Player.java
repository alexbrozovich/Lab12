import java.util.Random;

public class Player {
	private String name;
	public Player() {
		
	}
	public Player(String name) {
		this.name = name;

	}
	public Roshambo generateRoshambo() {
		Roshambo RPS;
		RPS = Roshambo.PAPER;
		Random rand = new Random();
		int i = rand.nextInt(3) + 1;
		System.out.println(i);
		if (i == 1) {
			RPS = Roshambo.ROCK;
		}
		else if (i == 2) {
			RPS = Roshambo.PAPER;
		}
		else if (i == 3) {
			RPS = Roshambo.SCISSORS;
		}
		return RPS;

	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	
}
