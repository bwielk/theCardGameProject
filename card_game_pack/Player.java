package card_game_pack;

public class Player{
  
  private String name;
  private Hand hand;

  public Player(String name){
    this.name = name;
    this.hand = hand;
  }

  public String getName(){
    return this.name;
  }
  // public Card showCard(){
  //   return hand.get(0);
  // }
}