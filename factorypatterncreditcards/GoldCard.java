package factorypatterncreditcards;

public class GoldCard implements CreditCard{
  private int creditLimit = 2000;
  private String cardType = "GOLD";
  
  @Override
  public int getCreditLimit() {
    return creditLimit;
    
  }

  @Override
  public String getCardType() {
    return cardType;
  }
  
}
