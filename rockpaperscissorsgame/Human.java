package rockpaperscissorsgame;

public class Human {

  public Action play() {
		System.out.println("Choose between (R) Paper (P) Scissors (S)");
		String res = RockPaperScissorsGame.scanner.next();
		while (Action.getActionbyId(res) == null) {
			System.out.println("Wrong input! Choose between (R) Paper (P) Scissors (S)");
			res = RockPaperScissorsGame.scanner.next();
		}
		return Action.getActionbyId(res);
	}
  
}
