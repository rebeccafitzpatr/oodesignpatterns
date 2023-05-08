public class Cappucino implements Coffee {

  @Override
  public void grindBeans() {
    System.out.println("use about 3 grms of espresso roast coffee");  
  }

  @Override
  public void make() {
    System.out.println("add 100ml of milk and add foam");
  }
  
}
