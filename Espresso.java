public class Espresso implements Coffee {
  
  @Override
  public void grindBeans() {
    System.out.println("Use 9 grms of espresso roast coffee for a single espresso shot");
  }

  @Override
  public void make() {
    System.out.println("Put the portaffiller in the espresso machine, press the button");
  }
}

