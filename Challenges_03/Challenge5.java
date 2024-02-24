package Challenges_03;

//Create a Java program that demonstrates the use of each compound assignment operator
//with integers.
//Write a program to calculate the price after discount. Take the original price and discount
//percentage as input. Use compound assignment operator to perform the calculation.

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        a += b;
        System.out.println("+=: " + a);

        a -= b;
        System.out.println("-=: " + a);

        a *= b;
        System.out.println("*=: " + a);

        a /= b;
        System.out.println("/=: " + a);


        a %= b;
        System.out.println("%=: " + a);

        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the price: ");
        float price = scanner.nextFloat();
        System.out.println("Insert the discount: ");
        int discount = scanner.nextInt();
        if(discount < 0){
            System.out.println("Wrong percentage! Try again!");
            System.exit(0);
        }
        float actualPrice = price-((float)discount/100)*price;
        System.out.println("The new price is "+actualPrice);

    }
}

