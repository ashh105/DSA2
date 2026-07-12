package dsa3;

import java.util.Scanner;

public class sums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativesum = 0;
        int positiveoddsum = 0;
        int positiveevensum = 0;
        while (true) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num == 0) {
break;
            } else if (num < 0) {
             negativesum=negativesum+num;
            } else if (num % 2 ==0) {
                positiveevensum= positiveevensum+num;
                
            }
            else {
                positiveoddsum= positiveoddsum+num;
            }
        }
        System.out.println(" the negative sum is "+negativesum);
        System.out.println("The sum odd is "+positiveoddsum);
        System.out.println("The sum  even is "+positiveevensum);
    }
}