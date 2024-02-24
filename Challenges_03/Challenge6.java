package Challenges_03;

//Write a Java program that takes two numbers from the user and uses relational operators to
//display whether the first number is greater than, less than, or equal to the second number.
//Create a program that checks if a user entered number is within a specific range (e.g., 1-100).
//Use relational operators for the checks.
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }


        System.out.println("Enter a number to check if it's within the range of 1-100: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 1 && userNumber <= 100) {
            System.out.println(userNumber + " is within the range of 1-100.");
        } else {
            System.out.println(userNumber + " is outside the range of 1-100.");
        }

    }
}
