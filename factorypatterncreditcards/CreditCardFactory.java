package factorypatterncreditcards;

import factorypatterncreditcards.Main.Income;

public class CreditCardFactory {
  public static CreditCard createCard(Income income) {

    switch(income) {
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
