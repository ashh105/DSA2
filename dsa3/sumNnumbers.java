package dsa3;

import java.util.Scanner;

public class sumNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter?");
         int n = sc.nextInt();
         int sum = 0;
        for (int i = 1; i <=n; i++) {
            System.out.println("enter numbers"+i+":");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println(sum);

    }
}
