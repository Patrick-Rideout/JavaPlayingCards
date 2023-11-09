package A6;

import java.io.PrintStream;

PrintStream printstream = new PrintStream();

public class FunWithPlayingCards {

    public static void main(String[] args) {
        System.out.println("Fun with Playing Cards!");

        PlayingCard playingCard = new PlayingCard(2, PlayingCard.Suit.DIAMONDS);

        System.out.println(playingCard.printAsciiCard(playingCard););


    }

}