import java.util.ArrayList;

public class Dealer {

        private ArrayList<Card> dealtCards;
        private int handValue;
        private boolean isWinner;

        public Dealer() {
            this.handValue = 0;
            this.dealtCards = new ArrayList<Card>();
            this.isWinner = false;
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
