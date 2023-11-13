package A6;

import java.io.PrintStream;
public class PlayingCard {
    public static final int ACE = 14;

    private int value;
    private Suit suit;

    public PlayingCard(int value, Suit suit) {
        if (value < 2 || value > ACE) {
            throw new IllegalArgumentException("Invalid card value");
        }
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String valueStr;
        if (value == 11) {
            valueStr = "J";
        } else if (value == 12) {
            valueStr = "Q";
        } else if (value == 13) {
            valueStr = "K";
        } else if (value == 14) {
            valueStr = "A";
        } else {
            valueStr = String.valueOf(value);
        }

        String suitSymbol;
        if (suit == PlayingCard.Suit.DIAMONDS) {
            suitSymbol = "\u2666";
        } else if (suit == PlayingCard.Suit.HEARTS) {
            suitSymbol = "\u2665";
        } else if (suit == PlayingCard.Suit.CLUBS) {
            suitSymbol = "\u2663";
        } else if (suit == PlayingCard.Suit.SPADES) {
            suitSymbol = "\u2660";
        } else {
            throw new IllegalArgumentException("Invalid suit value");
        }

        return valueStr + " " + suitSymbol;
    }

    public static void printAsciiCard(PlayingCard playingCard, PrintStream printStream) {
        String suitSymbol = switch (playingCard.getSuit()) {
            case DIAMONDS -> "\u2666";
            case HEARTS -> "\u2665";
            case CLUBS -> "\u2663";
            case SPADES -> "\u2660";
        };
        int intCardValue = playingCard.getValue();
        String strCardValue;
        if (intCardValue == 11) {
            strCardValue = "J";
        } else if (intCardValue == 12) {
            strCardValue = "Q";
        } else if (intCardValue == 13) {
            strCardValue = "K";
        } else if (intCardValue == 14) {
            strCardValue = "A";
        } else {
            strCardValue = String.valueOf(intCardValue);
        }

         printStream.println(" _______");
         printStream.printf("|%s      |\n", strCardValue);
         printStream.printf("|   %s   |\n", suitSymbol);
         printStream.printf("|      %s|\n", strCardValue);
         printStream.println(" -------");
    }

    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADES}
}

