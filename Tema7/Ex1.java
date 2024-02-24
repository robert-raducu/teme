package Tema7;

import java.util.Scanner;

//Create a Java program where you define an integer variable with a value of 5.
//Use an if statement to check if the number is greater than 10. If it is,
//print "The number is greater than 10";
//otherwise, print "The number is not greater than 10".
public class Ex1 {
    public static void main(String[] args){
        int var1 = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar");
        int var2 = scanner.nextInt();
        if ( var1 > 10){
            System.out.println("The number is greater than 10");
        }
        else
            System.out.println("The number is not greater than 10");

        if ( var2 > 10){
            System.out.println("The number is greater than 10");
        }
        else
            System.out.println("The number is not greater than 10");

    }

}
