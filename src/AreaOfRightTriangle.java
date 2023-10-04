import java.lang.*;
import java.util.Scanner;

public class AreaOfRightTriangle {
    public static void main(String[] args) {
       float base, height, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! We will get the area of an RIGHT TRIANGLE based on the base and height values that you will provide.");
        System.out.println("Please provide a value the BASE of the triangle.");
        base=sc.nextFloat();
        System.out.println("Please provide a value for the HEIGHT of the triangle.");
        height=sc.nextFloat();
        area=(base * height)/2;
        System.out.println("The area of your triangle is: " + area);
    }
}


