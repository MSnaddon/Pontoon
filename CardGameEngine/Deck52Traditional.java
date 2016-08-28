package cardGameEngine;

import java.util.*;

public class Deck52Traditional{

  private ArrayList<TradCard> deck = new ArrayList<TradCard>(); 

  public Deck52Traditional(){
    deckBuilder();
  }

  private void deckBuilder(){
    for (Suit suit : Suit.values()){
      for (Rank value : Rank.values()){
        deck.add(new TradCard(suit, value));
      }
    }
  }

  public TradCard getCard(int id){
    return deck.get(id);
  }

  public void shuffle(){
    Collections.shuffle(deck);
  }
  
  public TradCard dealCard(){
    return deck.remove(0);
  }
}