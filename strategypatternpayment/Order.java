package strategypatternpayment;

public class Order {
  // this class is very versatile, it can handle any payment type, 
  //because we have made  them so versatile
  
  private final Payment payment;
  private final int amount;

  public Order(int amount, Payment payment) {

    this.amount = amount;
    this.payment = payment;
  }

  public void process() {

    payment.pay(amount);
  }
  
}
