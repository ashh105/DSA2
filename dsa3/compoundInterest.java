package dsa3;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter principal amount");
        double  pv = sc.nextDouble();
        System.out.println(" Enter Annual interest rate");
        double  Rate = sc.nextDouble();
        System.out.println("Enter number of times interest is compounded per year");
        double n = sc.nextDouble();
        System.out.println(" Enter number of years for compounded interest");
        double time=sc.nextDouble();
        double amount = pv * Math.pow((1+Rate/n),n*time);
        double compundInterest = amount * pv;
        System.out.println("compound interest is "+compundInterest);
    }
}
