import java.util.Scanner;

public class HumanPlayer extends Player{
	public Roshambo generateRoshambo() {
		Scanner scan = new Scanner(System.in);
		Roshambo RPS;
		RPS = Roshambo.PAPER;
		System.out.println("Please choose (R)ock, (P)aper, or (S)cissors.");
		char userIn = scan.nextLine().charAt(0);
		if (userIn == 'r' || userIn == 'R') {
			RPS = Roshambo.ROCK;
		}
		else if (userIn == 'p' || userIn == 'P') {
			RPS = Roshambo.PAPER;
		}
		else if (userIn == 's' || userIn == 'S') {
			RPS = Roshambo.SCISSORS;
		}
		return RPS;
	}
}
