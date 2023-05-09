package factorypatterncoffee;
public class Americano implements Coffee {

  @Override
  public void grindBeans() {
    System.out.println("use 6 grms of espresso roast coffee");
  }

  @Override
  public void make() {
    System.out.println("add 100 ml of hot water");
  }
  
}
