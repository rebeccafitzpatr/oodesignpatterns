package factorypatterncreditcards;

import factorypatterncreditcards.Main.Income;

public class CreditCardFactory {
  public static CreditCard createCard(Income income) {

    switch(income) {
      case PLASTIC:
      return new PlasticCard();
      

      case SILVER:
        return new SilverCard();

      case GOLD:
        return new GoldCard();

      case PLATINUM:
        return new PlatinumCard();

    }
    return null;
  }
}
