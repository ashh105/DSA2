package dsa3;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount");
        int product = input.nextInt();
        System.out.println("Enter the discount amount");
        int discountpercentage = input.nextInt();
        int discountamount = product*discountpercentage/100;
        int finalprice = discountamount-product;
        System.out.println("The discount is "+finalprice);

    }
}
