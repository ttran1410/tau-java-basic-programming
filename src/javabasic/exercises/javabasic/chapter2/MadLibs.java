package javabasic.exercises.javabasic.chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){
        // 1. ask user for a season
        System.out.println("Please input your selected season");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        // 2. ask user for a whole number
        System.out.println("Please enter a whole number");
        int wholeNumber = scanner.nextInt();
        // 3. ask user for an adjective
        System.out.println("Please input an adjective");
        String adjective = scanner.next();
        scanner.close();
        // display result
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + wholeNumber +
                " cups of coffee.");
    }
}
