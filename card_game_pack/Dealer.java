package card_game_pack;
import java.util.*;

public class Dealer{
  private ArrayList<Card> dealerCards = new ArrayList<Card>();

  public Dealer(){
    this.dealerCards = new ArrayList<Card>();
  }

  public void shuffleDeck(Deck deck){
    deck.shuffleDeck();
  }

  public void drawCard(Deck deck){
    shuffleDeck(deck);
    dealerCards.add(deck.drawCard());
  }

  public int cardCount(){
    return dealerCards.size();
  }

  public void giveCard(Hand playerHand, int number){
    int index = 0;
    while(number <= cardCount() && number != 0){
      playerHand.acceptCard(dealerCards.remove(index));
      index++ ;
    }
  }    
}




//you can create numerous packages
//rules package