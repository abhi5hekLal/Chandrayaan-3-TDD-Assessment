import java.util.ArrayList;
import java.util.Arrays;

public class SpaceCraft {
    private int xCoordinate;
    private int yCoordinate;
    private int zCoordinate;
    private String direction;
    SpaceCraft() {
        xCoordinate = 0;
        yCoordinate = 0;
        zCoordinate = 0;
        direction = "N";
    }

    SpaceCraft(int xCoordinate, int yCoordinate, int zCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
        this.direction = direction;
    }

    ArrayList<Integer> finalPositionOfSpaceCraft() {
        return new ArrayList<Integer>(Arrays.asList(xCoordinate, yCoordinate, zCoordinate));
    }
}
