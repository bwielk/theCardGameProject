import static org.junit.Assert.*;
import org.junit.*;
import card_game_pack.*;

public class DealerTest{

  Dealer dealer;
  Deck deck;
  Card card;
  Hand hand;

  @Before
  public void before(){
    dealer = new Dealer();
    deck = new Deck();
    card = new Card(CardValue.NINE, CardSuit.CLUB, CardValue.NINE.strength);
    hand = new Hand();
  }

  @Test
  public void canGetaCardOutOfTheDeck(){
    deck.createDeck();
    dealer.drawCard(deck);
    dealer.drawCard(deck);
    assertEquals(2, dealer.cardCount());
  }

  @Test
  public void canPassACardToAPlayer(){
    deck.createDeck();
    dealer.drawCard(deck);
    dealer.drawCard(deck);
    dealer.giveCard(hand, 1);
    assertEquals(1, dealer.cardCount());
  }

 //  @Test
 //  public void canShuffleTheDeck(){
 //   Card card1 = new Card(CardValue.TWO, CardSuit.CLUB);
 //   Card card2 = new Card(CardValue.THREE, CardSuit.CLUB);
 //   Card card3 = new Card(CardValue.FOUR, CardSuit.HEART);
 //   Card card4 = new Card(CardValue.FIVE, CardSuit.HEART);

 //   deck.addCard(card1);
 //   deck.addCard(card2);
 //   deck.addCard(card3);
 //   deck.addCard(card4);

 //   comp1 = deck.get(0);
 //   dealer.shuffleDeck(deck);
 //   comp2 = deck.get(0);
 //   assertEquals(true, comp1 != comp2);
 // }

}