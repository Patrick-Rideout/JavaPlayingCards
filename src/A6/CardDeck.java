package A6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The CardDeck class represents a deck of playing cards and operations related to the deck.
 */
public class CardDeck {

    /** The deck of playing cards. */
    private ArrayList<PlayingCard> deckOfCards;

    /** The hand of playing cards drawn from the deck. */
    private ArrayList<PlayingCard> handOfCards;

    /**
     * Constructs a CardDeck with a complete deck of 52 standard playing cards.
     * Initializes the deckOfCards and handOfCards ArrayLists.
     */
    public CardDeck() {
        this.deckOfCards = new ArrayList<>();
        this.handOfCards = new ArrayList<>();
        PlayingCard.Suit suit;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                suit = PlayingCard.Suit.CLUBS;
            } else if (i == 1) {
                suit = PlayingCard.Suit.DIAMONDS;
            } else if (i == 2) {
                suit = PlayingCard.Suit.SPADES;
            } else {
                suit = PlayingCard.Suit.HEARTS;
            }
            for (int j = 2; j < 15; j++) {
                deckOfCards.add(new PlayingCard(j, suit));
            }
        }
    }

    /**
     * Retrieves the deck of cards.
     *
     * @return The ArrayList containing the deck of cards.
     */
    public ArrayList<PlayingCard> getDeckOfCards() {
        return deckOfCards;
    }

    /**
     * Retrieves the hand of cards.
     *
     * @return The ArrayList containing the hand of cards.
     */
    public ArrayList<PlayingCard> getHandOfCards() {
        return handOfCards;
    }

    /**
     * Shuffles the deck of cards.
     *
     * @param cardDeck The CardDeck instance to shuffle.
     */
    public static void shuffleDeck(CardDeck cardDeck) {
        Collections.shuffle(cardDeck.deckOfCards);
    }

    /**
     * Draws a card from the deck and adds it to the hand of cards. If the deck is empty, regenerates the deck.
     *
     * @param cardDeck The CardDeck instance to draw a card from.
     */
    public static void drawCard(CardDeck cardDeck) {
        if (cardDeck.deckOfCards.isEmpty()) {
            cardDeck.deckOfCards = new ArrayList<>();
            PlayingCard.Suit suit;
            for (int i = 0; i < 4; i++) {
                if (i == 0) {
                    suit = PlayingCard.Suit.CLUBS;
                } else if (i == 1) {
                    suit = PlayingCard.Suit.DIAMONDS;
                } else if (i == 2) {
                    suit = PlayingCard.Suit.SPADES;
                } else {
                    suit = PlayingCard.Suit.HEARTS;
                }
                for (int j = 2; j < 15; j++) {
                    cardDeck.deckOfCards.add(new PlayingCard(j, suit));
                }
            }
        }
        cardDeck.handOfCards.add(cardDeck.deckOfCards.get(0));
        cardDeck.deckOfCards.remove(0);
    }
}
