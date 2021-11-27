package javabasic.chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args){
        // 1. Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // 2. Get what we don't know
        System.out.println("Please enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter the number of years with your current job:");
        double years = scanner.nextDouble();

        scanner.close();

        // Make decision
        if (salary >= requiredSalary && years >= requiredYearsEmployed){
            System.out.println("Congrats! You qualify for the loan.");
        }
        else {
            System.out.println("Sorry, you must earn at least $ "
                    + requiredSalary + " and work at least " + requiredYearsEmployed
                    + " years at your current job to qualify for the loan");
        }
    }
}
