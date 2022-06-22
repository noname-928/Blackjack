package blackjack;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Card {
    private final Suit suit;
    private final Point point;

    //表示用
    @Override
    public String toString() {
        return suit.toString() + "-" + point.toString();
    }
}