package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    void getX_Return_zeroAsValue() {
        String given = "inputfield_0";

        int actual = PlayerCharacter.getX();

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void getY_Return_zeroAsValue() {
        String given = "inputfield_0";

        int actual = PlayerCharacter.getY();

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test void move_WhenW_ThenMoveUp_AfterMove_Y_isZeroIsTrue(){
        int given = 0;

        int actual = PlayerCharacter.move("w");

        int expected = 1;

        assertEquals(expected, actual);
    }
}
