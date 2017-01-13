import static org.junit.Assert.*;
import org.junit.*;
import card_game_pack.*;

public class HandTest{

  Hand hand;
  Card card;
  Dealer dealer;

  @Before
  public void before(){
    hand = new Hand();
    card = new Card(CardValue.NINE, CardSuit.CLUB);
    dealer = new Dealer();
  }

  @Test
  public void HandCanAcceptCards(){
    hand.acceptCard(card);
    Card card2 = new Card(CardValue.EIGHT, CardSuit.HEART);
    hand.acceptCard(card2);
    assertEquals(2, hand.cardCount());
  }
}