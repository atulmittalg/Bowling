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
        bowlingGame.calculateScorePerRoll(5);
        Assert.assertEquals(5,bowlingGame.calculateGameScore());
    }

    @Test
    public void shouldSetScoreTo10When5PinsAreDroppedTwice(){
        bowlingGame.calculateScorePerRoll(5);
        bowlingGame.calculateScorePerRoll(5);
        Assert.assertEquals(10,bowlingGame.calculateGameScore());
    }
}