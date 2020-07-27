import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> playingCards;


    public Deck() {
        this.playingCards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        this.playingCards.add(card);
    }

    public int getNumberOfCards () {
        return this.playingCards.size();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
          for (RankType rank : RankType.values()){
            Card card = new Card(suit, rank);
            this.addCard(card);
          }
        }
    }

    public Card dealCard() {
      return playingCards.remove(0);
      // add to player
    }


    public void shuffleDeck() {
      Collections.shuffle(this.playingCards);
    }
}
