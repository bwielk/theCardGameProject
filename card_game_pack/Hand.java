package card_game_pack;
import java.util.*;

public class Hand{

  private ArrayList<Card>hand = new ArrayList<Card>();
  
  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public int cardCount(){
    return hand.size();
  }

  public void acceptCard(Card card){
    if(0 ==hand.size()){
      hand.add(card);
    }
  }

  public void cardAway(){
    hand.remove(0);
  }

  public void clearHand(){
    hand.clear();
  }

  public Card showCard(){
    return hand.get(0);
  }
}