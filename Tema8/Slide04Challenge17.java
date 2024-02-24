package Tema8;

//17. Write a Java program that simulates a simple authentication system.
//Declare a boolean variable hasUsername and hasPassword. Set up a series of logical
//conditions using these two variables that will check the following conditions:
//
//If both hasUsername and hasPassword are true, print "Authentication successful".
//If either hasUsername or hasPassword is false, print "Authentication failed".
//If hasUsername is true but hasPassword is false, print "Password is incorrect".


import java.util.Scanner;

public class Slide04Challenge17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the username: ");
        boolean hasUsername = scanner.nextBoolean();
        if(!hasUsername){
            System.out.println("Authentication failed");
            System.exit(0);
        }
        System.out.println("Insert the password: ");
        boolean hasPassword = scanner.nextBoolean();

        if (hasPassword)
            System.out.println("Authentication successful");
        else {
            System.out.println("Password is incorrect");
            System.out.println("Authentication failed");
        }
    }
}
