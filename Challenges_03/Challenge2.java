package Challenges_03;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the variable: ");
        int var = input.nextInt();
        System.out.println("The incremented value is " + (++var));
        System.out.println("The decremented value is " + (--var));
        System.out.println("The reversed value is " + (-var));

        input.close();
    }
}

