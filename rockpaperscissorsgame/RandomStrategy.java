package rockpaperscissorsgame;

import java.util.Random;

public class RandomStrategy implements Strategy {
  @Override
    public Action decideAction(){
      Random randomNum = new Random();

      double number = randomNum.nextDouble();

      if (number < 0.33) {
        return Action.ROCK;
      } else if (number >= 0.33 && number < 0.66) {
        return Action.PAPER;
      } else {
        return Action.SCISSORS;
      }
  }
  
}
