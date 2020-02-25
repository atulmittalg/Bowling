package runner.java.com.kata;

import main.java.com.kata.Frame;
import main.java.com.kata.Roll;

import java.util.Scanner;

public class BowlingRunner {
    public static void main(String[] args) {
        Frame[] frames = new Frame[11];
        Roll[] rolls = new Roll[2];
        for(int i = 0; i< 10; i++){
            for (int j = 0; j < 2; j++){
                Scanner scan = new Scanner(System.in);
                char pinsDropped = scan.next().charAt(0);
                if (pinsDropped == '/'){
                    rolls[j].setPinsDropped(0);
                    rolls[j].setIsStrike(true);
                }
                else {
                    rolls[j].setPinsDropped(pinsDropped);
                    rolls[j].setIsStrike(false);
                }
            }
            frames[i].setRolls(rolls);

        }
    }
}
