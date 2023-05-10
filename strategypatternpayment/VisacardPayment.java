package strategypatternpayment;

public class VisacardPayment implements Payment{
  double fee = 0.001;

  @Override
  public void pay(int amount) {
    System.out.println("Completing Visa payment: Charge $" + amount);
    System.out.println("Fee: " + fee * amount);

  }

}
