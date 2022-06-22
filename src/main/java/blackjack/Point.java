package blackjack;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Point {
    private final int numberOfCard;     //AからKまでを1~13とする（絵札を数字に置き換えたもの）
    private final String name;          //表示用
    private final int calculationPoint; //計算用

    //コンストラクタ
    public Point(int numberOfCard) {
        this.numberOfCard = numberOfCard;

        //表示用に変換
        if (numberOfCard == 1) {
            this.name = "A";
        } else if (numberOfCard == 11) {
            this.name = "J";
        } else if (numberOfCard == 12) {
            this.name = "Q";
        } else if (numberOfCard == 13) {
            this.name = "K";
        } else {
            this.name = String.valueOf(numberOfCard);
        }

        //計算用に変換
        if (numberOfCard == 11 | numberOfCard == 12 | numberOfCard == 13) {
            this.calculationPoint = 10;
        } else {
            this.calculationPoint = numberOfCard;
        }
    }

    //表示用に加工
    @Override
    public String toString() {
        return name;
    }
}
