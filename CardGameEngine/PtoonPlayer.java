package cardGameEngine;

import java.util.Scanner;


public class PtoonPlayer extends Player {

  // From Player
  //   PtoonHand hand
  //   String name
  // getCardFromDeck(deck)

  PtoonHand ptHand;
  boolean busted;
  int score;

  public PtoonPlayer(String name){
    super(name, new PtoonHand());
    busted = false;
    this.ptHand = (PtoonHand) this.hand;
  }



  public void printHandString(){
    String handString = "";
    for (TradCard card : ptHand.getCards()){
      handString += card.getRank() + " " + card.getSuitString() + "\n";
    }
    System.out.println(handString);
  }

  public void playTurn(Deck52Traditional deck){
    Integer handValue;
    getCardFromDeck(deck);
    getCardFromDeck(deck);
    while(!busted){
      //Evaluate hand
      handValue = (Integer) PontoonGame.evaluateHand(ptHand);
      //print users hand to screen
      printHandString();
      //Check for busted
      if (handValue > 21){
        System.out.println("Busted for overage drinking");
        busted = true;
        break;
      } else {
        //Ask user if they want to twist
        String response = askForTwist();
        if (response.equals("y")){
          getCardFromDeck(deck);
        } else {
          break; //break out and assign score
        }
      }
    System.out.println("\n");
    this.score = handValue;
    }
  }

  public String askForTwist(){
    System.out.println("Twist? (y = yes)");
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

  public int cardCount() {
    return ptHand.size();
  }

  public int getScore(){
    return this.score;
  }

  public void resetBusted(){
    this.busted = false;
  }
}