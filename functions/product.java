package functions;

import java.util.Scanner;

public class product{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        System.out.println(product(num1,num2));
    }
    static int product(int a, int b){
        int pro= 1;
        pro=a*b;
        System.out.print("The product of the two numbers is: ");
        return pro;
    }
}
