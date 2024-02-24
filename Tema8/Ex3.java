package Tema8;

import java.util.Scanner;

//Create a program that takes three numbers as input and print the largest number among them.
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        int nr1 = scanner.nextInt();
        System.out.println("Insert the second number: ");
        int nr2 = scanner.nextInt();
        System.out.println("Insert the third number: ");
        int nr3 = scanner.nextInt();
        if (nr1 >= nr2 && nr1 > nr3)
            System.out.println("The first number is the largest");
        else if (nr2 >= nr1 && nr2 > nr3)
            System.out.println("The second number is the largest");
        else if (nr3 > nr1 && nr3 > nr2)
            System.out.println("The third number is the largest");
        else if(nr1 == nr2 && nr1 == nr3){
            System.out.println("All numbers are equal");
        }
    }
}
