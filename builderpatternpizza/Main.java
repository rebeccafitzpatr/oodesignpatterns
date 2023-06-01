package builderpatternpizza;

public class Main {
  public static void main(String[] args) {
    Pizza pizza = new Pizza.Builder(10).addCheese().addSausages(3).build();
    System.out.println(pizza);
  }
  
}
