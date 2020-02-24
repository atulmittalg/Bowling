package test.java.com.kata;


import main.java.com.kata.Bowling;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {
    Bowling bowlingGame;

    @Before
    public void initializeBowlingObj(){
        bowlingGame = new Bowling();
    }

    private void setRollScoreToForMultipleRolls(final int numberOfRolls, final int pinsDropped){
        for(int i =0; i < numberOfRolls; i++){
            bowlingGame.calculateScorePerRoll(pinsDropped);
        }
    }

    @Test
    public void shouldSetScoreToZeroBeforeStartOfTheGame(){
        Assert.assertEquals(0,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldSetScoreToZeroWhenZeroPinsAreDroppedForSingleRoll(){
        bowlingGame.calculateScorePerRoll(0);
        Assert.assertEquals(0,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldSetScoreTo5When5PinsAreDroppedForSingleRoll(){
        setRollScoreToForMultipleRolls(1,5);
        Assert.assertEquals(5,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldSetScoreTo10When5PinsAreDroppedTwice(){
        setRollScoreToForMultipleRolls(2,5);
        Assert.assertEquals(10,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldCalculateScoreWhenGettingStrikeAnd2NormalRolls(){
        bowlingGame.calculateScorePerRoll(10);
        setRollScoreToForMultipleRolls(2,3);
        Assert.assertEquals(22,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldCalculateScoreWhenGetting2ContinousStrikesFollowedBy2NormalRolls(){
        bowlingGame.calculateScorePerRoll(10);
        bowlingGame.calculateScorePerRoll(10);
        setRollScoreToForMultipleRolls(2,3);
        Assert.assertEquals(45,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldCalculateScoreTo300WhenGettingStrikesInAllRolls(){
        setRollScoreToForMultipleRolls(12,10);
        Assert.assertEquals(300,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldCalculateScoreWhenGettingSpareAnd2NormalRolls(){
        setRollScoreToForMultipleRolls(2,5);
        setRollScoreToForMultipleRolls(2,3);
        Assert.assertEquals(19,bowlingGame.calculateGameScore());
    }
}