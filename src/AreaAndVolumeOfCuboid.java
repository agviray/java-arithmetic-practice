import java.lang.*;
import java.util.Scanner;

// - Write a program to find the total area and volume of a given cuboid.
public class AreaAndVolumeOfCuboid {
    public static void main(String[] args) {
        int length, width, height;
        Scanner sc = new Scanner(System.in);

        System.out.println("To find the total area and volume of a cuboid, we'll first enter values for the cuboid's length, width, and height.");
        System.out.println("Enter a length value.");
        length=sc.nextInt();
        System.out.println("Enter a width value.");
        width=sc.nextInt();
        System.out.println("Enter a height value.");
        height=sc.nextInt();
        System.out.println("Volume is: " + length*width*height);
        System.out.println("Total area is: " + 2*(length*width+length*height+width*height));
    }
}
