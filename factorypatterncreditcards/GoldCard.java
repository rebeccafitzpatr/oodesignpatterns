package factorypatterncreditcards;

public class GoldCard implements CreditCard{
  private int creditLimit = 2000;
  
  @Override
  public int getCreditLimit() {
    return creditLimit;
    
  }
  
}
