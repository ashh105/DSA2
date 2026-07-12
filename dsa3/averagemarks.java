package dsa3;

import java.util.Scanner;

public class averagemarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subjects :");
        double subject = input.nextDouble();
        double sum = 0;
        for (int i = 1; i <= subject; i++) {
            System.out.println("Enter Marks :"+i+":");
            double Marks = input.nextDouble();
            sum +=Marks;
        }
        double average = sum/subject;
        System.out.println("Average Marks :"+average);
    }
    }
