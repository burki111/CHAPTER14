package Chapter14Coin;

public class Player {
    // Fields for player's name and guess
    private String name;
    private String guess;

    // Constructor to accept player's name
    public Player(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for guess
    public String getGuess() {
        return guess;
    }

    // Setter for guess
    public void setGuess(String guess) {
        this.guess = guess;
    }
}

