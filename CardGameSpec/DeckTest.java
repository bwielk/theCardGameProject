import static org.junit.Assert.*;
import org.junit.*;
import card_game_pack.*;

public class DeckTest{

  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(CardValue.TEN, CardSuit.DIAMOND, CardValue.TEN.strength);
  }

  @Test
  public void canCreateDeck(){
    deck.createDeck();
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void canAddAndStoreCards(){
    deck.addCard(card);
    Card card2 = new Card(CardValue.NINE, CardSuit.DIAMOND, CardValue.NINE.strength);
    deck.addCard(card2);
    assertEquals(2, deck.cardCount());
  }
}