package functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int num=input.nextInt();
        System.out.println(fact(num));
    }
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        return fact;
    }
}
