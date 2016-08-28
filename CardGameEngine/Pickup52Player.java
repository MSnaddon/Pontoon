package cardGameEngine;


public class Pickup52Player extends Player {

  public Pickup52Player(String name){
    super(name, new Pickup52Hand());
  }

  public void playTurn(Deck52Traditional deck){
    
  }

  public int cardCount() {
    return hand.size();
  }

  public void pickUpCard(Deck52Traditional deck){
  }
  

}