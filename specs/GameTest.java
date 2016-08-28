import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import cardGameEngine.*;

public class GameTest{

  PtoonPlayer dealer;
  ArrayList<PtoonPlayer> players;
  Deck52Traditional deck;


  @Before
  public void before(){
    dealer = new PtoonPlayer("Dealer");
    PtoonPlayer player1 = new PtoonPlayer("Mutley");
    PtoonPlayer player2 = new PtoonPlayer("Dasterdly");
    deck = new Deck52Traditional();
    players.add(player1);
    players.add(player2);
  }

  @Test
  public 











}