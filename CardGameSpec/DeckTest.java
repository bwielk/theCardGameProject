import static.org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(CardValue.10, CardSuit.DIAMOND);
  }

  @Test
  public void canAddAndStoreCards(){
    deck.addCard(card);
    card2 = new Card(CardValue.10, CardSuit.DIAMOND);
    deck.addCard(card2);
    assertEquals(2, deck.cardCount())
  }
}