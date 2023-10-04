// - Program that calculates the area of a right triangle based on user inputs for the triangle's base and height.
// - The formula for finding the area of a right triangle is:
//   area = (base * height) / 2
import java.lang.*;
import java.util.Scanner;

public class AreaOfRightTriangle {
    public static void main(String[] args) {
        // - Declare variables needed.
        float base, height, area;
        // - Implement Scanner to receive user's keyboard input.
        Scanner sc = new Scanner(System.in);

        // - Setup text to print in console. This will guide the user.
        System.out.println("Hi! We will get the area of an RIGHT TRIANGLE based on the base and height values that you will provide.");
        System.out.println("Please provide a value the BASE of the triangle.");
        // - Scans user input as a float data type and assigns it to the base variable.
        base = sc.nextFloat();
        System.out.println("Please provide a value for the HEIGHT of the triangle.");
        // - Scans user input as a float data type and assigns it to the height variable.
        height = sc.nextFloat();
        // - Calculate area of triangle based on user inputs, and assign the result to the area variable.
        area = (base * height) / 2;
        // - Print the result in the console.
        System.out.println("The area of your right triangle is: " + area);
    }
}


