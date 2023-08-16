import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpaceCraftTest {
    @Test
    void shouldReturnFinalPositionAsZero() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(0, 0, 0));
        assertEquals(expectedList, SC.finalPositionOfSpaceCraft());
    }

    @Test
    void shouldReturnFinalPositionAsSetByParameterizedConstructor() {
        SpaceCraft SC = new SpaceCraft(1, 0, 2, "S");
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 0, 2));
        assertEquals(expectedList, SC.finalPositionOfSpaceCraft());
    }



    @Test
    void shouldIncreaseYCoordinateByOneForCommandF() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(List.of("f"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getYCoordinate());
    }

    @Test
    void shouldIncreaseXCoordinateByOneForCommandF() {
        SpaceCraft SC = new SpaceCraft(0, 0, 0, "E");
        ArrayList<String> commands = new ArrayList<>(List.of("f"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getXCoordinate());
    }

    @Test
    void shouldIncreaseZCoordinateByOneForCommandF() {
        SpaceCraft SC = new SpaceCraft(0, 0, 0, "Up");
        ArrayList<String> commands = new ArrayList<>(List.of("f"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getZCoordinate());
    }

    @Test
    void shouldIncreaseYCoordinateByOneForCommandB() {
        SpaceCraft SC = new SpaceCraft(0, 0, 0, "S");
        ArrayList<String> commands = new ArrayList<>(List.of("b"));
        SC.controlSpacecraft(commands);
        assertEquals(1, SC.getYCoordinate());
    }

    @Test
    void shouldRotateCraftToWest() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(List.of("l"));
        SC.controlSpacecraft(commands);
        assertEquals("W", SC.getDirection());
    }

    @Test
    void shouldRotateToEast() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(List.of("r"));
        SC.controlSpacecraft(commands);
        assertEquals("E", SC.getDirection());
    }

    @Test
    void shouldRotateSpacecraftInTheUpwardDirection() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(List.of("u"));
        SC.controlSpacecraft(commands);
        assertEquals("Up", SC.getDirection());
    }

    @Test
    void shouldRotateSpacecraftInTheDownwardDirection() {
        SpaceCraft SC = new SpaceCraft();
        ArrayList<String> commands = new ArrayList<>(List.of("d"));
        SC.controlSpacecraft(commands);
        assertEquals("Down", SC.getDirection());
    }
}