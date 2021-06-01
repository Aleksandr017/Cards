import java.util.Objects;

public final class Card {

    private final String runk;
    private final String suit;

    public Card(String runk, String suit) {
        if (runk == null || suit == null) {
            throw new IllegalAccessException();

        }
        this.runk = runk;
        this.suit = suit;
    }
}
