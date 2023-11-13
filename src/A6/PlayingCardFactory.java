package A6;

import java.util.Random;

public class PlayingCardFactory {

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

    public static PlayingCard generateRandomCardFromSuit(PlayingCard.Suit suit) {
        Random random = new Random();
        int randomValue = random.nextInt(13) + 2;
        return new PlayingCard(randomValue, suit);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            PlayingCard randomCard = PlayingCardFactory.generateRandomCard();
            System.out.println("Random Card: " + randomCard);
        }
        for (int i = 0; i < 5; i++) {
            PlayingCard randomCard = PlayingCardFactory.generateRandomCardFromSuit(PlayingCard.Suit.HEARTS);
            System.out.println("Random Card Of Hearts: " + randomCard);
        }
    }
}
