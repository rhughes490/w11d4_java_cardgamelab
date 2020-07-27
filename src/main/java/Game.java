import java.util.ArrayList;

public class Game {

  private ArrayList<Player> players;
  private Dealer dealer;


  public Game(){
    this.players = new ArrayList<Player>();
    this.dealer = new Dealer();
  }

  public void addPlayer(Player player){
    this.players.add(player);
  }

  public Dealer getDealer() { return this.dealer; }

  public void getResult(){
    for (Player player : this.players) {
      if (player.getHandValue() > this.dealer.getHandValue() && !player.isBust()); {
        player.isWinner();
      } else {
        this.dealer.isWinner();
      }
    }
  }


  }




  // Start game
  // Deal cards
  // Print player 1 & player 2
  // Announce winner

}
