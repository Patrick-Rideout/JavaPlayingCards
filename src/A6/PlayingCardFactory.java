package A6;

import java.util.Random;

/**
 * The PlayingCardFactory class provides methods to generate random PlayingCard instances.
 */
public class PlayingCardFactory {

    /**
     * Generates a random PlayingCard instance with a random value and suit.
     *
     * @return A randomly generated PlayingCard.
     */
    public static PlayingCard generateRandomCard() {
        Random random = new Random();
        int randomValue = random.nextInt(13) + 2;
        int randomSuitValue = random.nextInt(4);
        PlayingCard.Suit randomSuit;
        if (randomSuitValue == 0) {
            randomSuit = PlayingCard.Suit.CLUBS;
        } else if (randomSuitValue == 1) {
            randomSuit = PlayingCard.Suit.DIAMONDS;
        } else if (randomSuitValue == 2) {
            randomSuit = PlayingCard.Suit.SPADES;
        } else {
            randomSuit = PlayingCard.Suit.HEARTS;
        }

        return new PlayingCard(randomValue, randomSuit);
    }

    /**
     * Generates a random PlayingCard instance with the specified suit.
     *
     * @param suit The specified suit for the generated card.
     * @return A randomly generated PlayingCard with the specified suit.
     */
    public static PlayingCard generateRandomCardFromSuit(PlayingCard.Suit suit) {
        Random random = new Random();
        int randomValue = random.nextInt(13) + 2;
        return new PlayingCard(randomValue, suit);
    }

    /**
     * The main method demonstrates the usage of the PlayingCardFactory class by generating
     * random cards and printing them to the console.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // Generates and prints 5 random cards
        for (int i = 0; i < 5; i++) {
            PlayingCard randomCard = PlayingCardFactory.generateRandomCard();
            System.out.println("Random Card: " + randomCard);
        }

        // Generates and prints 5 random cards of Hearts
        for (int i = 0; i < 5; i++) {
            PlayingCard randomCard = PlayingCardFactory.generateRandomCardFromSuit(PlayingCard.Suit.HEARTS);
            System.out.println("Random Card Of Hearts: " + randomCard);
        }
    }
}
