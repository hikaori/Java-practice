package JAVA_FOUNDATION_4th_edition_PP5.PP5_13;

import java.util.Random;

/**
 * Created by kaorihirata on 2017-04-29.
 */
public class Card {
        public static int NUM_FACES = 13;
        private int face, suit;
        private String faceName, suitName;

        public void myname() {
            System.out.println("My name is Derrick.");
        }

        //-----------------------------------------------------------------
        //  Creates a random card.
        //-----------------------------------------------------------------
        public Card() {
            face = (int) (Math.random() * 13) + 1;
            setFaceName();
            suit = (int) (Math.random() * 4) + 1;
            setSuitName();
        }

        //-----------------------------------------------------------------
        //  Creates a card of the specified suit and face value.
        //-----------------------------------------------------------------
        public Card(int faceValue, int suitValue) {
            face = faceValue;
            setFaceName();
            suit = suitValue;
            setSuitName();
        }

        //-----------------------------------------------------------------
        //  Sets the string representation of the face using its stored
        //  numeric value.
        //-----------------------------------------------------------------
        private void setFaceName() {
            switch (face) {
                case 1:
                    faceName = "Ace";
                    break;
                case 2:
                    faceName = "Two";
                    break;
                case 3:
                    faceName = "Three";
                    break;
                case 4:
                    faceName = "Four";
                    break;
                case 5:
                    faceName = "Five";
                    break;
                case 6:
                    faceName = "Six";
                    break;
                case 7:
                    faceName = "Seven";
                    break;
                case 8:
                    faceName = "Eight";
                    break;
                case 9:
                    faceName = "Nine";
                    break;
                case 10:
                    faceName = "Ten";
                    break;
                case 11:
                    faceName = "Jack";
                    break;
                case 12:
                    faceName = "Queen";
                    break;
                case 13:
                    faceName = "King";
                    break;

            }
        }

        //-----------------------------------------------------------------
        //  Sets the string representation of the suit using its stored
        //  numeric value.
        //-----------------------------------------------------------------
        private void setSuitName() {
            switch (suit) {
                case 1:
                    suitName = "Clubs";
                    break;
                case 2:
                    suitName = "Diamonds";
                    break;
                case 3:
                    suitName = "Hearts";
                    break;
                case 4:
                    suitName = "Spades";
                    break;
            }

        }

        //-----------------------------------------------------------------
        //  Determines if this card is higher than the passed card. The
        //  second parameter determines if aces should be considered high
        //  (beats a King) or low (lowest of all cards).  Uses the suit
        //  if both cards have the same face.
        //-----------------------------------------------------------------
        public boolean isHigherThan(Card card2, boolean aceHigh) {
            boolean result = false;

            if (face == card2.getFace()) {
                if (suit > card2.getSuit()) {
                    result = true;
                }
            } else {
                if (aceHigh && face == 1) {
                    result = true;
                } else {
                    if (face > card2.getFace()) {
                        result = true;
                    }
                }
            }
            return result;

        }

        //-----------------------------------------------------------------
        //  Determines if this card is higher than the passed card,
        //  assuming that aces should be considered high.
        //-----------------------------------------------------------------
        public boolean isHigherThan(Card card2) {
            return isHigherThan(card2, true);
        }

        //-----------------------------------------------------------------
        //  Returns the face (numeric value) of this card.
        //-----------------------------------------------------------------
        public int getFace() {
            return face;
        }

        //-----------------------------------------------------------------
        //  Returns the suit (numeric value) of this card.
        //-----------------------------------------------------------------
        public int getSuit() {
            return suit;
        }

        //-----------------------------------------------------------------
        //  Returns the face (string value) of this card.
        //-----------------------------------------------------------------
        public String getFaceName() {
            return faceName;
        }

        //-----------------------------------------------------------------
        //  Returns the suit (string value) of this card.
        //-----------------------------------------------------------------
        public String getSuitName() {
            return suitName;
        }

        //-----------------------------------------------------------------
        //  Returns the string representation of this card, including
        //  both face and suit. ex) "CLUBS of NINE"
        //-----------------------------------------------------------------
        public String toString() {
            return suitName + " of " + faceName;
        }

}

