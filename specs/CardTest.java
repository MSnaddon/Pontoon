import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;


public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card( Suit.CLUB, Value.QUEEN );
  }

  @Test
  public void getSuit() {
    assertEquals( Suit.CLUB, card.getSuit() );
  }

  @Test
  public void getValue() {
    assertEquals( Value.QUEEN, card.getValue() );
  }

}