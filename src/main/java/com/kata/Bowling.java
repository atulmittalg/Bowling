package main.java.com.kata;

public class Bowling {
    private int gameScore;
    private int[] listOfRollScores = new int[22];
    private int totalNumberOfRolls;

    public int calculateGameScore() {
        for(int rollPointer = 0; rollPointer < totalNumberOfRolls; rollPointer++){
            gameScore+=listOfRollScores[rollPointer];
            if(listOfRollScores[rollPointer] == 10){
                gameScore = gameScore + listOfRollScores[rollPointer+2] + listOfRollScores[rollPointer+3];
            }
        }
        return gameScore;
    }

    public void calculateScorePerRoll(int pinsDropped){
        listOfRollScores[totalNumberOfRolls++] = pinsDropped;
        if(pinsDropped == 10)   totalNumberOfRolls++;
    }
}