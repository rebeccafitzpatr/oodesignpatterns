package factorypatterncreditcards;

public class PlasticCard implements CreditCard{
  private int creditLimit = 500;
  private String cardType = "PLASTIC";

  @Override
  public int getCreditLimit() {
    return creditLimit;
  }

  @Override
  public String getCardType() {
    return cardType;
  }
  
}
