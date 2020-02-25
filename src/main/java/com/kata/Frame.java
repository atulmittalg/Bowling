package main.java.com.kata;

public class Frame {
    private Roll[] rolls;
    private boolean isSpare;

    public Roll[] getRolls() {
        return rolls;
    }

    public void setRolls(Roll[] rolls) {
        this.rolls = rolls;
    }

    public boolean isASpare() {
        return isSpare;
    }

    public void setSpare(boolean spare) {
        isSpare = spare;
    }
}
