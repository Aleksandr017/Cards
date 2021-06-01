import java.util.Objects;

public final class Card {

    private final String runk;
    private final String suit;

    public Card(String runk, String suit) {
        if (runk == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.runk = runk;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return runk.equals(card.runk) && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runk, suit);
    }
}
