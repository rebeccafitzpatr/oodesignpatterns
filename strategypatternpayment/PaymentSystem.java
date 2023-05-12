package strategypatternpayment;

public class PaymentSystem {
  private Payment payment;
  private int amount;

  public PaymentSystem(int amount, Payment payment) {
    this.amount = amount;
    this.payment = payment;
  }

  public void CheckLimit(int amount) {
    //this method will check if the customer is exceeding the max for card transaction
    //if they are, they will have to pay by cash

    if (amount > 80 & !(payment instanceof CashPayment) ) {
      System.out.println("Transaction is over limit, cash payment required");
      setPayment(new CashPayment());
    }
  }

  public void setPayment(Payment payment){
    this.payment = payment;
  }

  public void runPayment() {
    CheckLimit(amount);
    payment.pay(amount);

  }
  
}
