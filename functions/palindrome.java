package functions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        if (ispalindrome(word)){
            System.out.println(word+" is a palindrome");
        }
        else {
            System.out.println(word+" is not a palindrome");
        }
    }
    static boolean ispalindrome(String word){
        String reverse="";
      for (int i = word.length() -1; i >= 0; i--) {
          reverse = reverse + word.charAt(i);

      }
      if (word.equals(reverse)){
          return true;

    }
      else {
          return false;
      }
}
}
