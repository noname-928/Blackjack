package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Deck {
    private final List<Card> deck;

    //コンストラクタ
    public Deck() {
        List<Card> deck = new ArrayList<>();
        IntStream.rangeClosed(1, 13)
                .forEach(n -> Arrays.asList(Suit.values())
                        .forEach(s -> deck.add(new Card(s, new Point(n)))));
        Collections.shuffle(deck);  //生成した山札をシャッフル
        this.deck = deck;
    }

    //表示用
    @Override
    public String toString() {
        return deck.toString();
    }
}
