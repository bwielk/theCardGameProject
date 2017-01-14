package card_game_pack;
import java.util.*;

public class Game{

  private String name;
  private Deck deck;
  private ArrayList<Player> setOfPlayers = new ArrayList<Player>();
  private ArrayList<Deck> setOfDecks = new ArrayList<Deck>();


  public Game(String name){
    this.name = name;
    this.setOfPlayers = new ArrayList<Player>();
    this.setOfDecks = new ArrayList<Deck>();

  }

  public String getName(){
    return this.name;
  }

  public int playerCount(){
    return setOfPlayers.size();
  }

  public void createAPlayer(String name){
    Player player = new Player(name);
    setOfPlayers.add(player);
  }

}