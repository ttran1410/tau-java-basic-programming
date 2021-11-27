package javabasic.chapter3;

import java.util.Scanner;

/*
If Statement
All salespeople get a payment of $1000 per week
Salespeople who exceed 10 sales get a additinal bonus of $250
For those who don't, they are informed of how many sales they were
 */
public class QuotaCalculator {

    public static void main(String[] args){
        // 1. Initialize values we known
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        // 2. Get unknown values
        System.out.println("Enter the number of sales the employee made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // 3. Make a decision on the path to take - Output
        if(sales >= quota){
            salary = salary + bonus;
            System.out.println("Congrats! You've met your quota, " +
                    "here is your pay $" + salary);
        }
        else{
             int salesShort = quota - sales;
             System.out.println("You did not make your quota. You were " +
                     salesShort + " sales short");
        }
    }
}
