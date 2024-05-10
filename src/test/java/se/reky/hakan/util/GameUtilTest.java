package se.reky.hakan.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilTest {

    static GameUtil gameUtil;

    @BeforeEach
    void setUp() {
        gameUtil = new GameUtil();
    }

    @DisplayName("Testing of Game Exception was thrown")
    @Test
    void toLowerCaseButFirstLetterCapitalized() {
        assertThrows(GameException.class, () -> gameUtil.toLowerCaseButFirstLetterCapitalized(""));
    }
}