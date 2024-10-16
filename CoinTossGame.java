package Chapter14Coin;

import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Get player 1's guess
        String guess;
        do {
            System.out.print(player1.getName() + ", choose Heads or Tails: ");
            guess = scanner.nextLine().trim();

            if (!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)) {
                System.out.println("Invalid guess. Please choose 'Heads' or 'Tails'.");
            }
        } while (!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS));

        // Assign the guess to player 1
        player1.setGuess(guess);

        // Automatically assign the opposite to player 2
        if (player1.getGuess().equalsIgnoreCase(Coin.HEADS)) {
            player2.setGuess(Coin.TAILS);
        } else {
            player2.setGuess(Coin.HEADS);
        }

        // Print out player guesses
        System.out.println(player1.getName() + " guessed " + player1.getGuess());
        System.out.println(player2.getName() + " guessed " + player2.getGuess());

        // Flip the coin
        Coin coin = new Coin();
        coin.flip();

        // Determine the winner
        System.out.println("Coin landed on: " + coin.getSide());
        if (coin.getSide().equals(player1.getGuess())) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }
}
