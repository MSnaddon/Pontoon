import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;

public class PlayerTest {

  Player player;
  Card card;
  Deck deck;

  @Before
  public void before() {
    player = new Player( "Cardy McCardface");
    deck = new Deck();
  }

  @Test
  public void hasName() {
    assertEquals( "Cardy McCardface", player.getName() );
  }

  @Test
  public void startsWithNoCasrds() {
    assertEquals( 0, player.cardCount() );
  }

  @Test
  public void canGetCardFromDeck() {
    player.getCardFromDeck(deck, 2);
    assertEquals( 2, player.cardCount() );
  }

}