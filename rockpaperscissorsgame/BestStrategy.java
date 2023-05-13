package rockpaperscissorsgame;

public class BestStrategy implements Strategy {

  RockPaperScissorsGame game;
  

  public BestStrategy (RockPaperScissorsGame game) {
    this.game = game;
  }
  @Override
  public Action decideAction() {

    Action action = game.getHumanAction();
    return action;
  }
  
}
