package cardGameEngine;

public abstract class Player {

  protected String name;
  protected Hand hand;
  // Player must have ability to play a turn
  public abstract String playTurn(Deck52Traditional deck);

  public Player( String name, Hand hand) {
    this.name = name;
    this.hand = hand;
  }

  public String getName() {
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }

  public void getCardFromDeck(Deck52Traditional deck){
    hand.add(deck.dealCard());
  }
}