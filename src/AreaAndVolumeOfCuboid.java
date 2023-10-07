import java.lang.*;
import java.util.Scanner;

// - Write a program to calculate the surface area and volume of a given cuboid.
// - Formula to get the surface area of a cuboid is:  SA = 2lw + 2lh + 2hw, or SA = 2(lw + lh + wh)
// - Formula to get the volume of a cuboid is: volume = length * width * height
public class AreaAndVolumeOfCuboid {
    public static void main(String[] args) {
        // - Declare variables.
        int length, width, height;
        Scanner sc = new Scanner(System.in);

        // - Instruct user to provide cuboid values.
        System.out.println("To find the surface area and volume of a cuboid, you'll need to first enter values for the cuboid's length, width, and height.");
        System.out.println("Enter a length value, then hit the ENTER key.");
        // - Assign user values to variables.
        length = sc.nextInt();
        System.out.println("Enter a width value, then hit the ENTER key.");
        width = sc.nextInt();
        System.out.println("Enter a height value, then hit the ENTER key.");
        height = sc.nextInt();
        // - Calculate volume and surface area of the cuboid.
        System.out.println("The surface area of your cuboid is: " + 2 * (length * width + length * height + width * height));
        System.out.println("The volume of your cuboid is: " + length * width * height);
    }
}
