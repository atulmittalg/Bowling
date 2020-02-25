package main.java.com.kata;

public class Roll {
    private int pinsDropped;
    private boolean isStrike;

    public Roll() {
        pinsDropped = 0;
        isStrike = false;
    }

    public boolean isAStrike() {
        return isStrike;
    }
    public int getPinsDropped() {
        return pinsDropped;
    }
    public void setPinsDropped(int pinsDropped) {
        this.pinsDropped = pinsDropped;
    }
    public void setIsStrike(boolean isStrike) {
        this.isStrike = isStrike;
    }
}