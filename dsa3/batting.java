package dsa3;

import java.util.Scanner;

public class batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter scored run");
        int run = sc.nextInt();
        System.out.println("enter outs");
        int outs = sc.nextInt();
        int average = run/outs;
        System.out.println("average is: " + average);

    }
}
