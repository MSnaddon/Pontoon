package cardGameEngine;
import java.util.*;

public class PontoonGame{
  
  private Deck52Traditional deck;
  private PtoonPlayer dealer;
  private ArrayList<PtoonPlayer> players;

  public static int evaluateHand(PtoonHand hand){
    int value = 0;
    boolean isAce = false;
    //for each card in hand
    for( int i = 0 ; i < hand.size(); i++){
      TradCard card = hand.getCard(i);
      int rank = card.getRankInt();       //get rank interger of card
      if (rank == 1){                     // tally Ace and add as 1
       isAce = true;
       value += rank;
      } else if (rank > 9){               // take face cards as value of 10
        value += 10;
      } else {                            // add value of card otherwise
        value += rank; 
      }
    }
    if (isAce && value < 12){  //if an ace being 11 doesn't push the value past 21, make the ace worth 11
      value += 10;
    }
    return value;
  }



  public void setup(){
    deck = new Deck52Traditional();
    dealer = new PtoonPlayer("Dealer");
    players = new ArrayList<PtoonPlayer>();
  }
  public void gameLoop(){
    boolean runGame = false;
    do{
      System.out.println("Game is being played");
      
      runGame = true;


    } while(runGame == false);



  }
  public void endGame(){
    //present statitstics etc
  }
}