package Tema8;

import java.util.Scanner;

//Create a simple program that takes a number as input and uses if-else statements
//to categorize the number as "positive," "negative," or "zero."
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();
        if (number > 0)
            System.out.println("The number is positive");
        else if (number == 0)
            System.out.println("The number is null");
        else
            System.out.println("The number is negative");
    }
}
