package card_game_pack;
import java.util.*;

public class Game{

  private String name;
  private ArrayList<Player> players = new ArrayList<Player>();
  private ArrayList<Deck> decks = new ArrayList<Deck>();
  private Player current_player;


  public Game(String name){
    this.name = name;
    this.players = new ArrayList<Player>();
    this.decks = new ArrayList<Deck>();
    this.current_player = players.get(0);
  }

  public String getName(){
    return this.name;
  }

  public int playerCount(){
    return players.size();
  }

  public void createAPlayer(String name){
    Player player = new Player(name);
    players.add(player);
  }

  public int deckCount(){
    return decks.size();
  }

  // public void addADeck(int number_of_decks){//--------------------------! wrong return type
  //   for(int i=0; i <= number_of_decks; i++){
  //     Deck newDeck = new Deck();
  //     decks.add(newDeck.createDeck());
  //   }
  // }

  public void currentPlayer(){
    return this.current_player;
  }

  public void setCurrentPlayer(ArrayList players){
    this.current_player = players.get(0);
  }

  public void nextTurn(){
    Collections.rotate(players, 1); //players = elements; 1 = distance;
  }

  



}
