package cardGameEngine;

import java.util.*;

public abstract class Hand{

  protected ArrayList<TradCard> cards;

  public Hand(){
    this.cards = new ArrayList<TradCard>();
  }

  public int size(){
    return cards.size();
  }

  public ArrayList<TradCard> getCards(){
    return this.cards;
  }

  public void add(TradCard card){
    cards.add(card);
  }

  // public TradCard removeCard(int id){
  //   return cards.remove(id);
  // }
}