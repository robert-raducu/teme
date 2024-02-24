package Tema7;

//Create a Java program where you define an integer variable with a value of 75.
//Use an if-else-if ladder to check the range in which the number falls.
//Use the ranges 0-50, 51-100, and 101-150, and print a message for each range specifying
//which range the number falls into.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number: ");
        int a = scanner.nextInt();
        if(a > 0 && a <=50){
            System.out.println("The number falls between 0 and 50");
        }
        else if (a > 51 && a <= 100){
            System.out.println("The number falls between 51 and 100");
        }
        else if (a > 101 && a <= 150){
            System.out.println("The number falls between 101 and 150");
        }
        else
            System.out.println("The number falls in another range of numbers");
    }
}
