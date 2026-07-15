package functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println(isprime(number));
    }
    static boolean isprime(int num){
        if (num <= 1){
            return false;
        }
        int c =2;
        while (c*c<=num){
            if (num%c==0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
