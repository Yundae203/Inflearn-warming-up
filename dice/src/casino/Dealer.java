package casino;

public class Dealer {

    private final Dice dice;
    private final Note note;

    private Dealer(Dice dice, Note note) {
        this.dice = dice;
        this.note = note;
    }

    public static Dealer playWith(Dice dice, Note note) {
        return new Dealer(dice, note);
    }

    public void rollDiceMultipleTimes(int rollTimes) {
        for (int i=0; i<rollTimes; i++) {
            note.record(dice.throwDice());
        }
    }

    public void tellTheResult() {
        note.printTheResult();
    }
}
