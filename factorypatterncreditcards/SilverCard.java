package factorypatterncreditcards;

public class SilverCard implements CreditCard {

  private int creditLimit = 2000;
  
  @Override
  public int setCreditLimit() {
    return creditLimit;
    
  }
  
}