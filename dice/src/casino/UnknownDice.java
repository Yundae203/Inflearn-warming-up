package casino;

public class UnknownDice extends Dice {

    private UnknownDice(int faces) {
        super(faces);
    }

    public static UnknownDice decideFaces(int faces) {
        return new UnknownDice(faces);
    }

    @Override
    public int throwDice() {
        return (int) (Math.random() * super.getFaces()) + 1;
    }
}
