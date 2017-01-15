package card_game_pack;
import java.util.*;

public class Deck implements Playable{

  private ArrayList<Card> deck = new ArrayList<Card>();

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public void createDeck(){
    for(CardValue value : CardValue.values()){
      for(CardSuit suit : CardSuit.values()){
        Card card = new Card(value, suit, value.strength); //a new CARD to be pushed <<
        deck.add(card);
      }
    }
  }

  public int cardCount(){
    return deck.size();
  }

  public void addCard(Card card){
    deck.add(card);
  }

  public Card drawCard(){
    return deck.remove(0);
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }    
}
