import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import cardGameEngine.*;

public class GameTest{

  PontoonGame game;


  @Before
  public void before(){
    this.game = new PontoonGame();

  }


  public void canAddPlayer(){
    game.setup(); // will prompt for player name (enter one name and quit)
    assertEquals(1, game.numberOfPlayers());
  }


  
}