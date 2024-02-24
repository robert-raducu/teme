package Challenges_03;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's within the range of 1-100:");
        int userNumber = scanner.nextInt();

        String result = (userNumber >= 1 && userNumber <= 100) ?
                "Number is within the range of 1-100." :
                "Number is outside the range of 1-100.";

        System.out.println(result);
    }
}
