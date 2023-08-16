public class SpaceCraft {
    int xCoordinate;
    int yCoordinate;
    int zCoordinate;
    String direction;
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


}
