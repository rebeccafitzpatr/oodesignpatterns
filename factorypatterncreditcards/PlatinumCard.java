package factorypatterncreditcards;

public class PlatinumCard implements CreditCard{
  private int creditLimit = 30000;
  private String cardType = "PLATINUM";
  
  @Override
  public int getCreditLimit() {
    return creditLimit;
    
  }

  @Override
  public String getCardType() {
    return cardType;
  }  
}
