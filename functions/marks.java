package functions;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks out of 100:");
        int marks = input.nextInt();
        System.out.println(grade(marks));
    }
    static char grade(int marks){
        if(marks<100-91){
            System.out.println("you got grade");
            return 'A';
        } else if (marks < 81-90) {
            System.out.println("you got grade");
            return 'B';
            
        } else if (marks < 71 ) {
            System.out.println("you got grade");
            return 'C';
        }
        else if (marks < 61 ) {
            System.out.println("you got grade");
            return 'C';
        }
        else if (marks < 51 ) {
            System.out.println("you got grade");
            return 'D';
        }
        else if (marks < 41 ) {
            System.out.println("you got grade");
            return 'D';
        }
        return 'F';
    }
}
