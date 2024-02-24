package Tema8;

//Create a program that takes a number as input and uses if statement to print whether
//the number is "positive" or "non-positive".

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();
        if (number >= 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is non-positive");
    }
}
