package dsa3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans= prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        if (c*c>n){
            return true;
        }
        return false;

    }
}