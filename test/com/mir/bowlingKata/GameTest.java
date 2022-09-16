package com.mir.bowlingKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    private Game game;

    protected void setup() {
        game = new Game();
    }

    @Test
    public void gameWith0PinsScored_ShouldReturnScoreOfZero() {
        // given
        setup();

        // when
        for(int i = 0; i < 20; i++) {
            game.roll(0);
        }

        // then
        assertEquals(0, game.score());
    }

    @Test
    public void gameWithAll1Pins_ShouldReturnScoreOf20() {
        // given
        setup();

        // when
        for(int i = 0; i < 20; i++) {
            game.roll(1);
        }

        // then
        assertEquals(20, game.score());
    }

}
