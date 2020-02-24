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
}
