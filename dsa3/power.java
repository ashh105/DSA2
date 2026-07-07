package dsa3;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter base");
        double base = sc.nextInt();
        System.out.println("enter exponent");
        double exponent = sc.nextInt();
       double power= Math.pow(base,exponent);
       System.out.println("power is: " + power);
    }
}
