package com.mir.bowlingKata;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(Integer pins) {
        rolls[currentRoll++] = pins;
    }

    public Integer score() {
        int score = 0;
        int frameNumber = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameNumber)) {
                score += 10 + strikeBonus(frameNumber);
                frameNumber++;
            }
            else if (isSpare(frameNumber)) {
                score += 10 + spareBonus(frameNumber);
                frameNumber += 2;
            } else {
                score += sumOfPinsInFrame(frameNumber);
                frameNumber += 2;
            }
        }
        return score;
    }

    private int sumOfPinsInFrame(int frameNumber) {
        return rolls[frameNumber] + rolls[frameNumber + 1];
    }

    private int spareBonus(int frameNumber) {
        return rolls[frameNumber+2];
    }

    private int strikeBonus(int frameNumber) {
        return rolls[frameNumber + 1] + rolls[frameNumber + 2];
    }

    private boolean isStrike(int frameNumber) {
        return rolls[frameNumber] == 10;
    }

    private boolean isSpare(int frameNumber) {
        return rolls[frameNumber] + rolls[frameNumber + 1] == 10;
    }
}
