package blackjack

import spock.lang.Specification
import spock.lang.Unroll

import static blackjack.Suit.*

@Unroll
class CardSpec extends Specification {
    def "カードの表示確認"() {
        expect:
        new Card(suit, new Point(numberOfCard)).toString() == exp

        where:
        suit | numberOfCard | exp
        S    | 1            | "S-A"
        H    | 11           | "H-J"
        D    | 12           | "D-Q"
        C    | 13           | "C-K"
        S    | 7            | "S-7"
    }
}
