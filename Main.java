import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SpaceCraft SC = new SpaceCraft();
        System.out.println("Initial Position of the spacecraft " + SC.finalPositionOfSpaceCraft());
        System.out.println("Initial Direction of the spacecraft " + SC.getDirection());
        System.out.println("---------------------------------------------------");

        ArrayList<String> controls = new ArrayList<>(Arrays.asList("f", "r", "u", "b", "l"));
        SC.controlSpacecraft(controls);

        System.out.println("Final Position of the spacecraft " + SC.finalPositionOfSpaceCraft());
        System.out.println("Final Direction of the spacecraft " + SC.getDirection());
    }
}