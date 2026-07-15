package functions;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int  ans = eveodd(num);
        System.out.println(ans);
    }
     static int eveodd(int n) {
         if (n % 2 == 0) {
             System.out.println("Even");
         }
         else {
             System.out.println("odd");
         }
         return n;
     }

     }

