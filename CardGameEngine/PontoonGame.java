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
      int rank = card.getRankInt();       //get rank integer of card
      if (rank == 1){                     // tally Ace and add to value as 1
       isAce = true;
       value += rank;
      } else if (rank > 9){               // take face cards as value of 10
        value += 10;
      } else {                            // add value of card otherwise
        value += rank; 
      }
    }
    //if an ace being 11 doesn't push the value past 21, make the ace worth 11
    if (isAce && value < 12){  
      value += 10;
    }
    return value;
  }

  public void setup(){
    deck = new Deck52Traditional();
    dealer = new PtoonPlayer("Dealer");
    requestPlayers();
    boolean done = false;
  }

  private void requestPlayers(){
    boolean done = false;
    while (!done && players.size() > 0){
      done = addPlayer();
    }
  }

  private boolean addPlayer(){
    System.out.println("Please enter name of player, or 'Done!' if finished");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    if (name.equals("Done")){
      return true;
    }else{
      this.players.add(new PtoonPlayer(name));
      return false;
    }
  }

  public void gameLoop(){
    boolean runGame = false;
    do{
      System.out.println("Game is being played");
      
      


      runGame = true;
    } while(runGame == false);



  }
  public void resetGame(){
    //present statitstics etc
  }
}