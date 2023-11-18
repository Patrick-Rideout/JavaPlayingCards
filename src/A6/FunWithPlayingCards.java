package A6;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * The FunWithPlayingCards class demonstrates various operations with a deck of playing cards.
 */
public class FunWithPlayingCards {

    public static void main(String[] args) {

        PrintStream printstream = new PrintStream(System.out);

        Scanner input = new Scanner(System.in);

        CardDeck cardDeck = new CardDeck();

        System.out.println("Fun with Playing Cards!");

        while (true) {
            System.out.println("\nSelections:");
            System.out.println("""
                    0. Break
                    1. Draw a Card
                    2. Draw a Hand
                    3. Shuffle Deck
                    4. Print Deck
                    5. Print Deck as Ascii Cards
                    6. Print Hand""");

            System.out.println("\nENTER SELECTION:");
            String selection = input.nextLine();
            if (selection.equals("0")) {
                break;
            } else if (selection.equals("1")) {
                if (cardDeck.getDeckOfCards().isEmpty()) {
                    cardDeck = new CardDeck();
                    CardDeck.drawCard(cardDeck);
                } else {
                    CardDeck.drawCard(cardDeck);
                }
            } else if (selection.equals("2")) {
                for (int i = 0; i < 7; i++) {
                    CardDeck.drawCard(cardDeck);
                }
            } else if (selection.equals("3")) {
                CardDeck.shuffleDeck(cardDeck);
            } else if (selection.equals("4")) {
                for (PlayingCard card : cardDeck.getDeckOfCards()) {
                    System.out.println(card);
                }
            } else if (selection.equals("5")) {
                for (PlayingCard card : cardDeck.getDeckOfCards()) {
                    PlayingCard.printAsciiCard(card, printstream);
                }
            } else if (selection.equals("6")) {
                for (PlayingCard card : cardDeck.getHandOfCards()) {
                    System.out.println(card);
                }
            }

        }

    }

}