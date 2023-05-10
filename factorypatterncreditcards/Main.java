package factorypatterncreditcards;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter  your income: ");
    int income = scan.nextInt();

    CreditCard card = CreditCardFactory.createCard(income);  
    int cardLimit = card.getCreditLimit();
    String cardTypeString = card.getCardType();

    System.out.println("You now have a " + cardTypeString + " card. The credit limit is " + cardLimit + " NZD");
  }
}

  
  

