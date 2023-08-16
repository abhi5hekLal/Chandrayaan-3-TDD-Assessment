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

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getzCoordinate() {
        return zCoordinate;
    }

    public String getDirection() {
        return direction;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setZCoordinate(int zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    ArrayList<Integer> finalPositionOfSpaceCraft() {
        return new ArrayList<Integer>(Arrays.asList(xCoordinate, yCoordinate, zCoordinate));
    }


    void controlSpacecraft(ArrayList<String> commands) {
        for(var command: commands) {
            if(command.equals("f")) {
                yCoordinate += 1;
            }

        }
    }
}
