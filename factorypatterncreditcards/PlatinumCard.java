package factorypatterncreditcards;

public class PlatinumCard implements CreditCard{
  private int creditLimit = 30000;
  
  @Override
  public int getCreditLimit() {
    return creditLimit;
    
  }
  
}
