package functions;

import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println(area(radius));
        System.out.println("Enter the circumference of the circle: ");
        double circumference = input.nextDouble();
        System.out.println(circum(radius));
    }
    static double area(double radius){
        double area;
        area = radius * radius;
        System.out.println("The area of the circle is: " );
        return area;
    }
    static double circum(double radius){
        double c = 2 * Math.PI * radius;
        System.out.println("The area of the circumference is: " );
        return c;

    }
}
