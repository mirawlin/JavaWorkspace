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
            if (isSpare(frameNumber)) {
                score += 10 + rolls[frameNumber+2];
            } else {
                score += rolls[frameNumber] + rolls[frameNumber + 1];
            }
            frameNumber += 2;
        }
        return score;
    }

    private boolean isSpare(int frameNumber) {
        return rolls[frameNumber] + rolls[frameNumber + 1] == 10;
    }
}
