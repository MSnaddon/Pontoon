import static org.junit.Assert.*;
import org.junit.*;
import cardGameEngine.*;

public class PlayerTest {

  PtoonPlayer player;
  Deck52Traditional deck;


  @Before
  public void before() {
    player = new PtoonPlayer( "Cardy McCardface");
    deck = new Deck52Traditional();

  }


  @Test
  public void playerHasName(){
    assertEquals("Cardy McCardface",player.getName());
  }

  @Test
  public void playerCanGetCard(){
    player.getCardFromDeck(deck);
    assertEquals(1, player.cardCount());
  }

  @Test
  public void playerHandCardsAreTradCards(){
    player.getCardFromDeck(deck);
    player.getCardFromDeck(deck);
    PtoonHand hand = (PtoonHand) player.getHand();
    
    assertEquals("Diamond", hand.getCard(0).getSuitString());
    assertEquals(2, hand.getCard(1).getRankInt());
  }

  // Test requires input
  
  // @Test
  // public void playersHandHasValue(){
  //   player.playTurn(deck);
  //   int handValue = PontoonGame.evaluateHand((PtoonHand) player.getHand());
  //   assertEquals(13, handValue);
  // }

}