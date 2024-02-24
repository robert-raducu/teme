package Challenges_03;

//Write a Java program that uses both the increment (++) and decrement (--) operators
//in a loop to count up to 10 and then back down to 1.
//Create a program that takes an integer as input and then increments and decrements it by 1,
//displaying the output at each stage.

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(" ");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();
        System.out.println(++number);
        System.out.println(--number);
    }
}
