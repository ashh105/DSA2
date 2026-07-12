package dsa3;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        double n = input.nextInt();
        double sum =0;
        for (int i = 1; i<=n; i++){
            System.out.println("Enter grade point"+i+ " :");
            double grade = input.nextDouble();
            sum +=grade;
        }
        double cgpa = sum/n;
        System.out.println("The cgpa is "+cgpa);
    }
}
