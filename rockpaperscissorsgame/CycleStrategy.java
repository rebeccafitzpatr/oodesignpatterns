package rockpaperscissorsgame;

public class CycleStrategy implements Strategy {

  private int counter;

  public CycleStrategy() {
    counter = 0;
  }

  @Override
  public Action decideAction() {
    counter ++;
    if (counter == 1) {
      return Action.ROCK;

    } else if (counter == 2) {
      return Action.PAPER;

    }else if (counter == 3) {
      counter = 1;
      return Action.SCISSORS;
    }
    
    return null;
  }
  
}
