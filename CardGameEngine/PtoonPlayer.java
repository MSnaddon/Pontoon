package cardGameEngine;


public class PtoonPlayer extends Player {

  // From Player
  //   PtoonHand hand
  //   String name
  // getCardFromDeck(deck)

  public PtoonPlayer(String name){
    super(name, new PtoonHand());
  }

  public String playTurn(Deck52Traditional deck){
    getCardFromDeck(deck);
    getCardFromDeck(deck);
    int handValue = PontoonGame.evaluateHand((PtoonHand) hand);
    return Integer.toString(handValue);



    // put 2 cards into hand and evaluate
    // choose to stick or twist
    // evaluate hand
  }

  public int cardCount() {
    return hand.size();
  }

}