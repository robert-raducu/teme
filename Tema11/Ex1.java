package Tema11;

//-Create a Java program where you define an integer variable with a value between 1 and 7. Use a switch statement to print
//the name of the corresponding day of the week. For example, if the variable has a value of 1, it should print "Monday".

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number between 1 and 7: ");
        int number = scanner.nextInt();

        switch(number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid number");
                break;
    }
    }
}
