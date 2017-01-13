import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(CardValue.ACE, CardSuit.HEART);
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.ACE, card.getValue());
  }

  @Test 
  public void canGetSuit(){
    assertEquals(CardSuit.HEART, card.getSuit());
  }
}