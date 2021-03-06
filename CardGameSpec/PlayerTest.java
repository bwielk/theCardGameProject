import static org.junit.Assert.*;
import org.junit.*;
import card_game_pack.*;

public class PlayerTest{

  Player player;
  Card card;
  Dealer dealer;
  Hand hand;

  @Before
  public void before(){
    player = new Player("Blaise");
    card = new Card(CardValue.KING, CardSuit.DIAMOND, CardValue.KING.strength);
    dealer = new Dealer();
    hand = new Hand();
  }

  @Test
  public void canGetPlayerName(){
    assertEquals("Blaise", player.getName());
  }




}