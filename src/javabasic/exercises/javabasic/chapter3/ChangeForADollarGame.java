package javabasic.exercises.javabasic.chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args){
        // 1. Initialize what we know
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        int dollar = 1;

        // 2. Get what we don't
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom to 'Change for a dollar'! " +
                "Your goal is to enter enough to make exactly $1.00");
        System.out.println("Enter your number of pennies:");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter your number of Dimes:");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarter:");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numberOfPennies * penny
                + numberOfNickels * nickel + numberOfDimes * dime
                + numberOfQuarters * quarter;
        if (total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short "
                    + String.format("%.2f", amountShort) + " cents.");
        }
        else if (total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over "
                    + String.format("%.2f", amountOver) + " cents.");
        }
        else {
            System.out.println("Yeahhh! That's exactly $1.00, You win!");
        }
    }
}
