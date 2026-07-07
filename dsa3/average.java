package dsa3;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = input.nextInt();
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println(average);

    }
    }
