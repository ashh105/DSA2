
package dsa3;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter original value");
        double original = sc.nextDouble();
        System.out.println("enter destination rate");
        double rate = sc.nextDouble();
        double decpreciation = (original*rate)/100;
        double currentvale = original-decpreciation;
        System.out.println("current value is: " + currentvale);

    }
}
