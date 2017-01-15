package card_game_pack;

public class Card implements Playable{
  
  private CardValue value;
  private CardSuit suit;
  private int strength;

  public Card(CardValue value, CardSuit suit, int strength){
    this.value = value;
    this.suit = suit;
    this.strength = value.strength;
  }
  public void setValue(){
    this.value = value;
  }

  public CardValue getValue(){
    return this.value;
  }

  public void setSuit(){
    this.suit = suit;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public int getStrength(){
    return this.strength = strength;
  }

}