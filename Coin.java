package Chapter14Coin;

import java.util.Random;

import java.util.Random;

public class Coin {
    // Constants for heads and tails
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    // Field for current side of the coin
    private String side;

    // Getter for the side
    public String getSide() {
        return side;
    }

    // No setter needed since flip() will set the side

    // Method to randomly flip the coin
    public void flip() {
        Random random = new Random();
        // Randomly assign heads or tails
        if (random.nextBoolean()) {
            side = HEADS;
        } else {
            side = TAILS;
        }
    }
}
