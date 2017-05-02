package JAVA_FOUNDATION_4th_edition_PP5.PP5_13;

/**
 * Created by kaorihirata on 2017-04-29.
 */
public class DeckOfCards {
        private Card[] deck;
        private int numCards;
        private int MAX_CARDS = 52;

        // Creates a full deck with the cards initially "in order".
        public DeckOfCards() {
            numCards = MAX_CARDS;
            deck = new Card[numCards];
            int i = 0;
            for(int face = 1; face < 14; face++) {
                for (int suit = 1; suit < 5; suit++) {
                    deck[i] = new Card(face, suit);
                    i++;
                }
            }
        }

        public Card[] getDeck() {
            return deck;
        }

        // Deals one card from the deck
        public Card deal() {
            Card last_card = deck[numCards-1];
            numCards--;
            return last_card;
        }

        // Returns the number of cards left in the deck.
        public int getNumCardsInDeck() {
            return numCards;
        }

        // Returns true if the deck has cards in it, else false.
        public boolean hasMoreCards() {
            if (numCards > 0) {
                return true;
            } else {
                return false;
            }
        }

        // Shuffles the deck by swapping random pairs of cards many times.
        public void shuffle() {
            int pos1, pos2;
            Card temp;
            int swap = 50;
            // 0 <= (int) Math.random() * 52 < 52
            for(int i = 0; i < swap; i++) {
                pos1 = (int) Math.random() * MAX_CARDS;
                pos2 = (int) Math.random() * MAX_CARDS;
                temp = deck[pos1];
                deck[pos1] = deck[pos2];
                deck[pos2] = temp;
            }

        }

    }

