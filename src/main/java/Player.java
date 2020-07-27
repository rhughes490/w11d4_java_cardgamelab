import java.util.ArrayList;

public class Player {

private ArrayList<Card> dealtCards;
private String name;
private int handValue;
private boolean isWinner;

  public Player(String name) {
    this.name = name;
    this.handValue = 0;
    this.dealtCards = new ArrayList<Card>();
    this.isWinner = false;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Card> getDealtCards() {
    return this.dealtCards;
  }

  public int hasCard() {
    return this.dealtCards.size();
  }

  public int getHandValue(){ return this.handValue; }

  public void isWinner(){ this.isWinner = true; }

  public void addToHandTotal(Card card) {
    this.handValue += card.getValueFromEnum();
  }

  public void receiveCard(Deck deck) {
    Card dealtCard = deck.dealCard();
    addToHandTotal(dealtCard);
    this.dealtCards.add(dealtCard);
  }
}
