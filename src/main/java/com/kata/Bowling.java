package main.java.com.kata;

public class Bowling {
    private int gameScore;

    public int calculateGameScore() {
        return gameScore;
    }

    public void calculateScorePerRoll(int pinsDropped){
        gameScore += pinsDropped;
    }
}
