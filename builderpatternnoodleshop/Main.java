package builderpatternnoodleshop;

import builderpatternnoodleshop.SoupNoodle.NoodleType;

public class Main {
  public static void main(String[] args) {
    SoupNoodle noodles = new SoupNoodle.Builder((NoodleType.THICK), SoupNoodle.Sizes.LARGE).build();
  }
}
