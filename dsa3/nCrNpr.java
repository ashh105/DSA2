package dsa3;

import java.util.Scanner;

public class nCrNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n");
        long n = input.nextLong();
        System.out.println("Enter value of r");
        long r = input.nextLong();
       long factn = fact(n);
       long factnr = fact(n-r);
       long nCr= factn/factnr;
        System.out.println("ncr is "+nCr);
     long factr = fact(r);
     long Npr = factn /(factr *(factnr));
        System.out.println("npr is "+Npr);
    }
    static long fact(long number){
        long f=1;
        for(long i=1;i<=number;i++){
            f=f*i;
        }
return f;
    }

}
