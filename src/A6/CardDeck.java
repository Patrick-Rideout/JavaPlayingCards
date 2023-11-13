package A6;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    private ArrayList<PlayingCard> deckOfCards;

    private ArrayList<PlayingCard> handOfCards;

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

    public ArrayList<PlayingCard> getDeckOfCards() {
        return deckOfCards;
    }

    public ArrayList<PlayingCard> getHandOfCards() {
        return handOfCards;
    }

    public static void shuffleDeck(CardDeck cardDeck) {
        Collections.shuffle(cardDeck.deckOfCards);
    }

    public static void drawCard(CardDeck cardDeck) {
        cardDeck.handOfCards.add(cardDeck.deckOfCards.get(0));
        cardDeck.deckOfCards.remove(0);
    }
}
