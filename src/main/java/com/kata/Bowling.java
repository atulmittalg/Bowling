package main.java.com.kata;

public class Bowling {
    private int gameScore;
    private int[] listOfRollScores = new int[22];
    private int totalNumberOfRolls;

    public int calculateGameScore() {
        for(int rollPointer = 0; rollPointer < totalNumberOfRolls; rollPointer++){
            int rollScore = listOfRollScores[rollPointer];
            gameScore+=rollScore;
            if(isStrike(rollScore)){
                gameScore = gameScore + listOfRollScores[rollPointer+2] + listOfRollScores[rollPointer+3];
            }
        }
        return gameScore;
    }

    public void calculateScorePerRoll(final int pinsDropped){
        listOfRollScores[totalNumberOfRolls++] = pinsDropped;
        if(isStrike(pinsDropped))   totalNumberOfRolls++;
    }

    private boolean isStrike(final int pinsDropped){
        return pinsDropped == 10;
    }
}