package dsa3;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        double x1 = sc.nextDouble();
        System.out.println("enter x2");
        double x2 = sc.nextDouble();
        System.out.println("enter y1");
        double y1 = sc.nextDouble();
        System.out.println("enter y2");
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println(distance);
    }
}
