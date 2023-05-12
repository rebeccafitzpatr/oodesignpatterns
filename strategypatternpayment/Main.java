package strategypatternpayment;

public class Main {
  
  public static void main(String[] args) {
    MastercardPayment master = new MastercardPayment();
    PaymentSystem system = new PaymentSystem(100, master);
    system.runPayment();
}
}
