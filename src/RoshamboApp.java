import java.util.Scanner;

public class RoshamboApp {
	public static char checkResult(Roshambo opponent, Roshambo human) {
		System.out.println("Opponent:" + opponent);
		System.out.println("You: " + human);
		char wld = 'w';
		if (human == Roshambo.PAPER) {
			if (opponent == Roshambo.PAPER) {
				wld = 'd';
			}
			else if (opponent == Roshambo.ROCK) {
				wld = 'l';
			}
			else {
				wld = 'w';
			}
		}
		else if(human == Roshambo.ROCK) {
			if (opponent == Roshambo.ROCK) {
				wld = 'd';
			}
			else if (opponent == Roshambo.PAPER) {
				wld = 'l';
			}
			else {
				wld = 'w';
			}
		}
		else {
			if (opponent == Roshambo.SCISSORS) {
				wld = 'd';
			}
			else if (opponent == Roshambo.ROCK) {
				wld = 'l';
			}
			else {
				wld = 'w';
			}
		}
		return wld;
	}
	public static void main(String[] args) {
		Roshambo opponentThrow;
		Roshambo userThrow;
		Scanner scan = new Scanner(System.in);
		
		Player p1 = new Player();
		p1.setName("John Goodman");
		RockThrower p2 = new RockThrower();
		p2.setName("Dwayne Johnson");
		
		System.out.println("Welcome to the ROSHAMBO SIMULATOR 3000");
		System.out.println("Please select your opponent: ");
		System.out.printf("1. %s\n2. %s\n", p1.getName(), p2.getName());
		int userIn = scan.nextInt();
		Player currentOpponent = p1;
		if (userIn == 1) {
			currentOpponent = p1;
		}
		else if (userIn == 2) {
			currentOpponent = p2;
		}
		char keepGoing = 'y';
		while (keepGoing == 'y') {
			keepGoing = 'n';
			HumanPlayer hp = new HumanPlayer();
			char result = checkResult(currentOpponent.generateRoshambo(), hp.generateRoshambo());
			if (result == 'd') {
				System.out.println("It's a draw!");
			}
			else if (result == 'w') {
				System.out.println("You win!");
			}
			else {
				System.out.println(currentOpponent.getName() + " wins!");
			}
			System.out.println("Do you want to play again?");
			keepGoing = scan.next().charAt(0);
		}
		System.out.println("Thanks for playing!");
	}

}
