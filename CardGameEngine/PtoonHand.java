package cardGameEngine;
import java.util.*;

public class PtoonHand extends Hand{

  //ArrayList<TradCard> cards

  public PtoonHand(){
    super();
  }

  public TradCard getCard(int id){
    return cards.get(id);
  }
}