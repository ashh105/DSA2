package dsa3;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total sales");
        int sales = sc.nextInt();
        System.out.println("Enter total commission percentage");
        int commission = sc.nextInt();
        double total = (sales * commission)/100;
        System.out.println("Total commission is: " + total);
    }
}
