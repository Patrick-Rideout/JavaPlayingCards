package A6;

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
        if (value == 11) valueStr = "J";
        else if (value == 12) valueStr = "Q";
        else if (value == 13) valueStr = "K";
        else if (value == 14) valueStr = "A";
        else valueStr = String.valueOf(value);

        String suitSymbol = switch (suit) {
            case DIAMONDS -> "\u2666";
            case HEARTS -> "\u2665";
            case CLUBS -> "\u2663";
            case SPADES -> "\u2660";
            default -> "?";
        };

        return valueStr + " " + suitSymbol;
    }

//    public static void printAsciiCard(PlayingCard playingCard, PrintStream printStream) {
//        // TODO: Implement this method to print ASCII representation of the card
//
//    }

    public enum Suit {DIAMONDS, HEARTS, CLUBS, SPADES}
}

