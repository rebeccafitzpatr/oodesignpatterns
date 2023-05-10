package factorypatterncreditcards;

public class CreditCardFactory {
  public static CreditCard createCard(int income) {

    
    if (income == 0){
      return new FreeCard();

    }else if (income > 0 && income <= 9999)  {
      return new PlasticCard();
      
    }else if (income <= 99999 && income >= 10000) {
      return new SilverCard();

    } else if ( income >= 100000 && income <= 199999) {
      return new GoldCard();

    } else if (income >= 200000) {
      return new PlatinumCard();
    } else {
      System.err.println("that is an invalid number");
      System.exit(0);
      return null;
    }
  }
}
