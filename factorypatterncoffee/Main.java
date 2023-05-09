package factorypatterncoffee;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //ask the user what kind of coffee they would like
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello welcome to our cafe!");
    System.out.println("What kind of coffee would you like to order today??");
    
    String order = scan.nextLine();

    Coffee coffee = CoffeeFactory.orderCoffee(order);
    coffee.grindBeans();
    coffee.make();
  }

  
}
