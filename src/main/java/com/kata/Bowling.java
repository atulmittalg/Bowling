package main.java.com.kata;

public class Bowling {
    private int gameScore;
    private int[] listOfRollScores = new int[22];
    private int totalNumberOfRolls;

    public int calculateGameScore() {
        gameScore = 0;
        int maxNonBonusRolls = Math.min(totalNumberOfRolls, 20);
        for(int rollPosition = 0; rollPosition < maxNonBonusRolls; rollPosition++){
            int rollScore = listOfRollScores[rollPosition];
            gameScore+=rollScore;
            calculateStrikeRollScore(rollPosition, rollScore);
            calculateSpareRollScore(rollPosition);
        }
        return gameScore;
    }

    private void calculateSpareRollScore(int rollPosition) {
        if(((rollPosition % 2) == 1) && !isAStrike(listOfRollScores[rollPosition - 1])){
            if(isAStrike(listOfRollScores[rollPosition] + listOfRollScores[rollPosition - 1])){
                gameScore+= listOfRollScores[rollPosition+1];
            }
        }
    }

    private void calculateStrikeRollScore(int rollPosition, int rollScore) {
        if(isAStrike(rollScore)){
            int rollScoreAfterStrike = listOfRollScores[rollPosition+2];
            if(isAStrike(rollScoreAfterStrike)  && rollPosition < 18) {
                gameScore = gameScore + rollScoreAfterStrike + listOfRollScores[rollPosition+4];
            }
            else  gameScore = gameScore + rollScoreAfterStrike + listOfRollScores[rollPosition+3];
        }
    }

    public void calculateScorePerRoll(final int pinsDropped){
        listOfRollScores[totalNumberOfRolls++] = pinsDropped;
        if(isAStrike(pinsDropped) && totalNumberOfRolls < 20)   totalNumberOfRolls++;
    }

    private boolean isAStrike(final int pinsDropped){
        return pinsDropped == 10;
    }

}