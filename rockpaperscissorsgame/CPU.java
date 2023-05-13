package rockpaperscissorsgame;

public class CPU {

  private Strategy strategy;

  public void setStrategy(Strategy newStrategy) {
    this.strategy = newStrategy;
  }

	public Action play() {
		
    Action action = strategy.decideAction();
    return action;
	}

  public void changeStrategy(RockPaperScissorsGame game) {
    

    if (game.getLossStreak() == 3 && strategy instanceof CycleStrategy) {
      setStrategy(new BestStrategy(game));
    } else if (game.getLossStreak() == 3 && strategy instanceof BestStrategy) {
      setStrategy(new RandomStrategy());
    }
  }

}
