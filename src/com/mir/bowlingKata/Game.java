package com.mir.bowlingKata;

public class Game {
    private Integer score = 0;

    public void roll(Integer pins) {
        score += pins;
    }

    public Integer score() {
        return score;
    }
}
