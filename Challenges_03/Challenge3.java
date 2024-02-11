package Challenges_03;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the variable: ");
        int var = input.nextInt();
        if(var>0)
        {
            System.out.println("The number is positive.");
        }
//checks the number is less than 0 or not
        else if(var<0)
        {
            System.out.println("The number is negative.");
        }
//executes when the above two conditions return false
        else {
            System.out.println("The number is zero.");
        }
            input.close();
    }

}

