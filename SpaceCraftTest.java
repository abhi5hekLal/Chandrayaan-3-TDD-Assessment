import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpaceCraftTest {
    @Test
    void shouldReturnFinalPositionAsZero() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
        assertEquals(expectedList, SC.finalPositionOfSpaceCraft());
    }

    @Test
    void shouldReturnFinalPositionAsSetByParameterizedConstructor() {
        SpaceCraft SC = new SpaceCraft(1, 0, 2, "S");
        ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 0, 2));
        assertEquals(expectedList, SC.finalPositionOfSpaceCraft());
    }



    @Test
    void shouldIncreaseYCoordinateByOneForCommandF() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("f"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getYCoordinate());
    }

    @Test
    void shouldIncreaseXCoordinateByOneForCommandF() {
        SpaceCraft SC = new SpaceCraft(0, 0, 0, "E");
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("f"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getXCoordinate());
    }

    @Test
    void shouldIncreaseZCoordinateByOneForCommandF() {
        SpaceCraft SC = new SpaceCraft(0, 0, 0, "Up");
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("f"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getZCoordinate());
    }

    @Test
    void shouldIncreaseYCoordinateByOneForCommandB() {
        SpaceCraft SC = new SpaceCraft(0, 0, 0, "S");
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("b"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getYCoordinate());
    }

    @Test
    void shouldRotateCraftToWest() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("l"));
        SC.controlSpacecraft(commands);
        assertEquals("W", SC.getDirection());
    }

    @Test
    void shouldRotateToEast() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("r"));
        SC.controlSpacecraft(commands);
        assertEquals("E", SC.getDirection());
    }
}