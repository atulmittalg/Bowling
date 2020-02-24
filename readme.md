# Bowling

Solution for the scoring of the classic Arcade game "Bowling", given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game.

## Purpose

By solving the bowling problem with use of Test Driven Development (TDD) approach, getting to know further usage and benefits of using TDD in day-to-day coding and improve the overall understanding of TDD.

## Approach

Using JAVA as the base and  Maven to handle the dependencies, following the approach of TDD to achieve the solution.
Creating test cases and developing accordingly to pass the test.

##### Bowling Scoring System

1. Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
2. In each frame, the bowler gets up to two tries to knock down all the pins.
3. If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
4. If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
5. If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
6. If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
7. The game score is the total of all frame scores.

##### Assumptions

1. All rolls are valid rolls.
2. Will not check for correct number of rolls and frames.
3. Will not provide scores for intermediate frames

##### Test Cases Covered

1. Setting the game score to 0 at the start of the game.
2. Calculating score for a Single Roll.
3. Calculating Score for multiple Rolls.
4. Calculating Score for a Strike followed by a normal frame.
5. Calculating Score for 2 Continous Strike followed by a normal frame.
6. Calulating Score for All frames as Strikes and bonus 2 rolls as Strikes. (Bonus Roll Functionality).
7. Calculating Score for a Spare followed by a normal frame.
8. Calulating Score for All frames as Spares along with Bonus Roll (Bonus Roll Functionality when getting a Spare).

## System Requirements

1. Java 1.6 or higher.
2. Maven - For Dependency Management (JUnit Dependency Added).
3. Intellij (or) any IDE supporting JAVA.