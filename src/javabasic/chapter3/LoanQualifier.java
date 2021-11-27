package javabasic.chapter3;

import java.util.Scanner;

/*
NESTED IFS:
to qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years
 */
public class LoanQualifier {

    public static void main(String[] args){
        // 1. Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed= 2;
        // 2. Get what we don't
        System.out.println("Please enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Pease enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();
        // 3. Make a decision
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredYearsEmployed + " years.");
            }
        }
        else {
            System.out.println("Sorry, You must earn at least $"
                    + requiredSalary + " to qualify for the loan");
        }
    }
}
