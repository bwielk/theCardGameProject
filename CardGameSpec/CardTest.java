import static org.junit.Assert.*;
import org.junit.*;
import card_game_pack.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(CardValue.ACE, CardSuit.HEART, CardValue.ACE.strength);
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.ACE, card.getValue());
  }

  @Test 
  public void canGetSuit(){
    assertEquals(CardSuit.HEART, card.getSuit());
  }

  @Test
  public void canGetStrength(){
    assertEquals(14, card.getStrength());
  }
}