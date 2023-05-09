package factorypatterncoffee;

public class CoffeeFactory {
  
  public static Coffee orderCoffee(String type) {
    switch (type) {

      case "ESPRESSO":
        return new Espresso();

      case "AMERICANO":
        return new Americano();

      case "CAPPUCINO":
        return new Cappucino();

      default:
        System.err.println("we do not sell that kind of coffee");
        System.exit(0);
    }
    return null;
  }
}
