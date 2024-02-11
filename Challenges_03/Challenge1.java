package Challenges_03;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 6;
        System.out.println("The addition of the numbers is " + (no1 + no2));
        System.out.println("The substraction of the numbers is " + (no1 - no2));
        System.out.println("The multiplication of the numbers is " + (no1 * no2));
        System.out.println("The division of the numbers is " + (no1 / no2));
        System.out.println("The modulus of the numbers is " + (no1 % no2));


        Scanner input = new Scanner(System.in);

        System.out.print("Enter an length: ");
        int length = input.nextInt();
        System.out.print("Enter an breadth: ");
        int breadth = input.nextInt();
        System.out.println("The area of a rectangle is "+(length*breadth));

        input.close(); //closing the scanner object
    }
}
