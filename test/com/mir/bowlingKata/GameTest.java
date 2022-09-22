package com.mir.bowlingKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    private Game game;

    protected void setup() {
        game = new Game();
    }

    private void playGame(Integer rolls, Integer pins) {
        for(int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void gameWith0PinsScored_ShouldReturnScoreOfZero() {
        // given
        setup();

        // when
        playGame(20, 0);

        // then
        assertEquals(0, game.score());
    }

    @Test
    public void gameWithAll1Pins_ShouldReturnScoreOf20() {
        // given
        setup();

        // when
        playGame(20, 1);

        // then
        assertEquals(20, game.score());
    }

    @Test
    public void gameWith1Spare_shouldCalculateBonusCorrectly() {
        // given
        setup();

        // when
        rollSpare();
        game.roll(3);
        playGame(17, 0);

        // then
        assertEquals(16, game.score());
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

}
