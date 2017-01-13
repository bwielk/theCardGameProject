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
    hand.add(card);
  }


}