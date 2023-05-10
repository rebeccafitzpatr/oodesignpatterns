package factorypatterncreditcards;

public class FreeCard implements CreditCard{
  private int creditLimit = 0;
  private String cardType = "FREE";
  @Override
  public int getCreditLimit() {
    return creditLimit;    
  }
  @Override
  public String getCardType() {
    return cardType;
  }

  
}
