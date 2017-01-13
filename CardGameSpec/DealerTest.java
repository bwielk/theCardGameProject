import static.org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest{

  Dealer dealer;
  Deck deck;
  Card card;

@Before
public void before(){
  dealer = new Dealer();
  deck = new Deck();
  card = new Card(CardValue.9, CardSuit.CLUB);
  player = new Player("JohnDoe");
}

@Test void canShuffleTheDeck(){
  deck.shuffleDeck()
}//mockito?

@Test
public void canGetaCardOutOfTheDeck(){
  deck.shuffleDeck();
  deck.drawCard();
  deck.drawCard();
  assertEquals(2, dealer.cardCount());
}

@Test
public void canPassACardToAPlayer(){
  deck.drawCard();
  deck.drawCard();
  dealer.giveCard(player);
  assertEquals(1, dealer.cardCount());
}

}