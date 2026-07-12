package dsa3;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string");
        String word = input.nextLine();
        String reverse = "";
        for (int i = word.length() -1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
            System.out.println("reverse "+reverse);
        }
    }
}
