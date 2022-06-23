package blackjack;

public class Point {
    private final int numberOfCard;
    private final String name;
    private final int calculationPoint;

    //コンストラクタ
    public Point(int numberOfCard) {
        this.numberOfCard = numberOfCard;

        //表示用
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

        //計算用
        if (numberOfCard == 11 || numberOfCard == 12 || numberOfCard == 13) {
            this.calculationPoint = 10;
        } else {
            this.calculationPoint = numberOfCard;
        }
    }

    //表示用
    @Override
    public String toString() {
        return name;
    }
}
