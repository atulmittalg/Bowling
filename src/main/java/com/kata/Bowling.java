package main.java.com.kata;

public class Bowling {
    private int gameScore;
    private int[] listOfRollScores = new int[22];
    private int totalNumberOfRolls;

    public int calculateGameScore() {
        for(int rollPosition = 0; rollPosition < totalNumberOfRolls; rollPosition++){
            int rollScore = listOfRollScores[rollPosition];
            gameScore+=rollScore;
            calculateStrikeRollScore(rollPosition, rollScore);
        }
        return gameScore;
    }

    private void calculateStrikeRollScore(int rollPosition, int rollScore) {
        if(isAStrike(rollScore)){
            int rollScoreAfterStrike = listOfRollScores[rollPosition+2];
            int frameScore = rollScoreAfterStrike + listOfRollScores[rollPosition+3];
            if(isAStrike(rollScoreAfterStrike)) gameScore = gameScore + rollScoreAfterStrike + listOfRollScores[rollPosition+4];
            else  gameScore = gameScore + frameScore;
        }
    }

    public void calculateScorePerRoll(final int pinsDropped){
        listOfRollScores[totalNumberOfRolls++] = pinsDropped;
        if(isAStrike(pinsDropped))   totalNumberOfRolls++;
    }

    private boolean isAStrike(final int pinsDropped){
        return pinsDropped == 10;
    }
}