package functions;

import java.util.Scanner;

public class maxmini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = input.nextInt();
        System.out.println("enter 2nd number");
        int b = input.nextInt();
        System.out.println("enter 3rd number");
        int c = input.nextInt();
        System.out.println( max(a,b,c));
        System.out.println(mini(a,b,c));
    }

    static int max(int a, int b, int c) {
        int maxi = a;
        if (b>maxi){
            maxi = b;
        }
        if (c>maxi){
            maxi = c;
        }
        System.out.println("maximum number is: ");
        return maxi;
    }

    static int mini(int a, int b, int c) {

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("minimum number is: ");
        return min;
    }
}

