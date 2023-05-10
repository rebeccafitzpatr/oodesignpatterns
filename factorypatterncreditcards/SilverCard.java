package factorypatterncreditcards;

public class SilverCard implements CreditCard {

  private int creditLimit = 1000;
  private String cardType = "SILVER";
  

  @Override
  public int getCreditLimit() {
    return creditLimit;
    
  }

  @Override
  public String getCardType() {
    return cardType;
    
  }
  
}