package factorypatterncreditcards;

import java.util.Scanner;

public class Main {

  public enum Income {SILVER, GOLD, PLATINUM}

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    int income = scan.nextInt();

    //first convert the income so that it can be used by the factory method.
    Income incomeClass = convertIncome(income);


    CreditCard card = CreditCardFactory.createCard(incomeClass);  

  }

  private static Income convertIncome(int income) {

    if (income <= 99999) {
      return Income.SILVER;

    } else if ( income >= 100000 && income <= 199999) {
      return Income.GOLD;

    } else if (income >= 200000) {
      return Income.PLATINUM;
    } else {
      return null;
    }
  }
}

  
  

