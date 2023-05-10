package strategypatternpayment;

public class MastercardPayment implements Payment{
  //mastercard has a fee of 0.15%
  double fee = 0.0015;

  @Override
  public void pay(int amount) {
    System.out.println("Completing Mastercard payment: Charge $" + amount);
    System.out.println("Fee: " + fee * amount);

  }
  
}