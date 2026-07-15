package functions;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class VOTING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = input.nextInt();
        System.out.println(votingage(age));
    }

    static int votingage(int age) {

        if (age >= 18) {
            System.out.println(" eligible for voting");
        } else {
            System.out.println("eligible for voting");
        }
        return age;
    }
}
