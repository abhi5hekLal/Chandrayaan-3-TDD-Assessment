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
    void shouldReturnFinalDirectionAsNorth() {
        SpaceCraft SC = new SpaceCraft();
        assertEquals("N", SC.finalDirection());
    }

    @Test
    void shouldReturnFinalDirectionAsSetByParameterizedConstructor() {
        SpaceCraft SC = new SpaceCraft(1, 0, 2, "S");
        ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 0, 2));
        assertEquals(expectedList, SC.finalPositionOfSpaceCraft());
    }
}