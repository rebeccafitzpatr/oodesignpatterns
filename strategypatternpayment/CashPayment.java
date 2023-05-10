package strategypatternpayment;

public class CashPayment implements Payment{

  @Override
  public void pay(int amount) {
    System.out.println("Conducting cash payment: Charge $" + amount);

  }
  
}
