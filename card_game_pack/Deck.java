package card_game_pack;
import java.util.*;

public class Deck{
  
private ArrayList<Card> deck = new ArrayList<Card>();

public Deck(){
  this.deck = new ArrayList<Card>();
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