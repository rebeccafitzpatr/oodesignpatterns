package strategypatternpayment;

public class Main {
  
  public static void main(String[] args) {
    Order order1 = new Order(15, new VisacardPayment());
    order1.process();

    Order order2 = new Order(100, new MastercardPayment());
    order2.process();

    Order order3 = new Order(100, new CashPayment());
    order3.process();
}
}
