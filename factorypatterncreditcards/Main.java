package factorypatterncreditcards;

import java.util.Scanner;

public class Main {

  public enum Income {SILVER, GOLD, PLATINUM}

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter  your income: ");
    int income = scan.nextInt();

    //first convert the income so that it can be used by the factory method.
    Income incomeClass = convertIncome(income);


    CreditCard card = CreditCardFactory.createCard(incomeClass);  
    int cardLimit = card.getCreditLimit();
    String cardTypeString = card.getCardType();

    System.out.println("You now have a " + cardTypeString + " card. The credit limit is " + cardLimit + " NZD");
  }

  private static Income convertIncome(int income) {

    if (income <= 99999 && income >= 0) {
      return Income.SILVER;

    } else if ( income >= 100000 && income <= 199999) {
      return Income.GOLD;

    } else if (income >= 200000) {
      return Income.PLATINUM;
    } else {
      System.err.println("that is an invalid number");
      System.exit(0);
      return null;
    }
  }
}

  
  

