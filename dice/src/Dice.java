abstract public class Dice {
    private final int faces;

    protected Dice(int faces) {
        this.faces = faces;
    }

    protected int getFaces() {
        return this.faces;
    }

    abstract int throwDice();
}
