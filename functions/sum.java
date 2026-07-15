package functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        System.out.println(sum(num1,num2));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
