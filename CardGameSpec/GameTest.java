import static org.junit.Assert.*;
import org.junit.*;
import card_game_pack.*;

public class GameTest{

  Game game;
  Deck deck;
  Player player;

  @Before 
  public void before(){
    game = new Game("Poker");
    deck = new Deck();
    player = new Player("Blaise");
  }

  @Test
  public void CanGetNameOfTheGame(){
    assertEquals("Poker", game.getName());
  }

  @Test
  public void CanCreateAPlayer(){
    game.createAPlayer("XYZ");
    game.createAPlayer("ABC");
    assertEquals(2, game.playerCount());
  }
}