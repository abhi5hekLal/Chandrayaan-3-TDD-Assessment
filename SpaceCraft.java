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

    public int getZCoordinate() {
        return zCoordinate;
    }

    public String getDirection() {
        return direction;
    }

    ArrayList<Integer> finalPositionOfSpaceCraft() {
        return new ArrayList<>(Arrays.asList(xCoordinate, yCoordinate, zCoordinate));
    }


    void controlSpacecraft(ArrayList<String> commands) {
        for(var command: commands) {
            switch (command) {
                case "f" -> {
                    if (direction.equalsIgnoreCase("N")) {
                        yCoordinate += 1;
                    } else if (direction.equalsIgnoreCase("S")) {
                        yCoordinate -= 1;
                    } else if (direction.equalsIgnoreCase("E")) {
                        xCoordinate += 1;
                    } else if (direction.equalsIgnoreCase("W")) {
                        xCoordinate -= 1;
                    } else if (direction.equalsIgnoreCase("Up")) {
                        zCoordinate += 1;
                    } else if (direction.equalsIgnoreCase("Down")) {
                        zCoordinate -= 1;
                    }
                }
                case "b" -> {
                    if (direction.equalsIgnoreCase("N")) {
                        yCoordinate -= 1;
                    } else if (direction.equalsIgnoreCase("S")) {
                        yCoordinate += 1;
                    } else if (direction.equalsIgnoreCase("E")) {
                        xCoordinate -= 1;
                    } else if (direction.equalsIgnoreCase("W")) {
                        xCoordinate += 1;
                    } else if (direction.equalsIgnoreCase("Up")) {
                        zCoordinate -= 1;
                    } else if (direction.equalsIgnoreCase("Down")) {
                        zCoordinate += 1;
                    }
                }
                case "l" -> {
                    if (direction.equalsIgnoreCase("E")) {
                        direction = "N";
                    } else if (direction.equalsIgnoreCase("W")) {
                        direction = "S";
                    } else if (direction.equalsIgnoreCase("N")) {
                        direction = "W";
                    } else if (direction.equalsIgnoreCase("S")) {
                        direction = "E";
                    } else if (direction.equalsIgnoreCase("Up")) {
                        direction = "N";
                    } else if (direction.equalsIgnoreCase("Down")) {
                        direction = "S";
                    }
                }
                case "r" -> {
                    if (direction.equalsIgnoreCase("E")) {
                        direction = "S";
                    } else if (direction.equalsIgnoreCase("W")) {
                        direction = "N";
                    } else if (direction.equalsIgnoreCase("N")) {
                        direction = "E";
                    } else if (direction.equalsIgnoreCase("S")) {
                        direction = "W";
                    } else if (direction.equalsIgnoreCase("Up")) {
                        direction = "S";
                    } else if (direction.equalsIgnoreCase("Down")) {
                        direction = "N";
                    }
                }
                case "u" -> direction = "Up";
                case "d" -> direction = "Down";
                default -> System.out.println("Invalid Input Command!");
            }
        }
    }
}
