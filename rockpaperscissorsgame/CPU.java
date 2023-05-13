package rockpaperscissorsgame;

public class CPU {

  Strategy strategy;

  public void setStrategy(RockPaperScissorsGame game) {
    this.strategy = new BestStrategy(game);
  }

	public Action play() {
		
    Action action = strategy.decideAction();
    return action;
	}

}
